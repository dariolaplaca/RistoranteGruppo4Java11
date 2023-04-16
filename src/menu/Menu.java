package menu;

import course.Beverages;
import course.Course;
import enumProject.AllergensEnum;
import enumProject.MenuTypeEnum;
import enumProject.TextModifierEnum;

import java.util.*;
/**
*
 */
public class Menu {

    private List<Course> courseList;
    private List<Course> menuOfTheDay;
    private String name;

    /**
     * This is the constructor for the Menu class
     * @param name Menu name
     */
    public Menu(String name) {
        this.name = name;
        this.courseList = new ArrayList<>();
        this.menuOfTheDay = new ArrayList<>();
    }

    public List<Course> getCourseList() {return courseList;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public List<Course> getMenuOfTheDay() {return this.menuOfTheDay;}

    public void addCourse(Course s) {courseList.add(s);}
    public void addAllCourse(List<Course> courseList) {this.courseList.addAll(courseList);}

    /**
     * Prints all the courses of the menu
     */
    public void printMenu() {
        System.out.println("\n\t" + TextModifierEnum.ANSI_BRIGHT_RED + TextModifierEnum.ANSI_BOLD + TextModifierEnum.ANSI_UNDERLINE + this.name + "'s menu" + TextModifierEnum.ANSI_RESET + "\n");
        Course currentCourse = courseList.get(courseList.size() - 1);
        for (Course c : courseList) {
            if (currentCourse.getClass() != c.getClass()) {
                System.out.println("\n\t" + TextModifierEnum.ANSI_UNDERLINE + TextModifierEnum.ANSI_BOLD + TextModifierEnum.ANSI_BRIGHT_RED + "\t" + c.getClass().getSimpleName() + TextModifierEnum.ANSI_RESET);
                currentCourse = c;
            }
            c.printInfo();
            System.out.println();
        }
    }
    /**
     * Generate a menu of the day. Menu contains a course of each type all
     */

    public void generateMenuOfTheDay(MenuTypeEnum menuType) {
        System.out.println("" + TextModifierEnum.ANSI_BOLD + TextModifierEnum.ANSI_BRIGHT_YELLOW + TextModifierEnum.ANSI_UNDERLINE + menuType.getName() + " MENU" + TextModifierEnum.ANSI_RESET);
        addOneDifferentCourseOfEachType(menuType);
        menuOfTheDay.sort(Comparator.comparingInt(a -> a.getCourseType().getOrder()));
        for (Course c : menuOfTheDay) {
            System.out.print(TextModifierEnum.ANSI_GREEN + c.getClass().getSimpleName() + ": " + TextModifierEnum.ANSI_RESET);
            c.printInfo();
            System.out.println();
        }
        double price = calculatePriceMenu();
        System.out.println("Total price: " + price);
        if (menuType == MenuTypeEnum.FEW_KCAL_MENU) {
            double sumKcalMenu = calculateKcalMenu();
            //calculateAndApplyDiscount();
            System.out.println(TextModifierEnum.ANSI_GREEN + "\n\tTotal Kcal: " + sumKcalMenu + TextModifierEnum.ANSI_RESET);
        }
    }
    /**
     * Adds a course of each type to the current menu
     */
    private void addOneDifferentCourseOfEachType(MenuTypeEnum menuType) {
//        currentMenu.clear();
        List<Course> shuffledList = new ArrayList<>(courseList);
        Collections.shuffle(shuffledList);
        HashSet<Class<? extends Course>> classSet = new HashSet<>();
        for (Course c : shuffledList) {
            Class<? extends Course> courseClass = c.getClass();
            if (!classSet.contains(courseClass) && (c.getMenuType().equals(menuType) || c.getMenuType().equals(MenuTypeEnum.BEVERAGE_MENU))) {
                menuOfTheDay.add(c);
                classSet.add(courseClass);
            }
        }
    }
    /**
     * @check if menu contains allergens
     */
    public void checkAllergens() {
        HashSet<AllergensEnum> newHash = new HashSet<>();
        for (Course c : menuOfTheDay) {
            if (c.getAllergens().equals(AllergensEnum.NONE)) {
                System.out.println(TextModifierEnum.ANSI_GREEN + "Allergens not present" + AllergensEnum.NONE.getName() + TextModifierEnum.ANSI_RESET);
            } else {
                c.getAllergens().forEach(a -> newHash.add(a));
            }
        }
        System.out.print(TextModifierEnum.ANSI_RED + "Attention please, allergens present: [ " + TextModifierEnum.ANSI_RESET);
        newHash.forEach(a -> System.out.print(TextModifierEnum.ANSI_YELLOW + a.getName() + ", " + TextModifierEnum.ANSI_RESET));
        System.out.print(TextModifierEnum.ANSI_RED + " ]" + TextModifierEnum.ANSI_RESET);
    }
    /**
     * @return an HashSet of 3 randoms courses that are not course.Beverages
     */
    public HashSet<Course> popularCourses() {
        HashSet<Course> finalHashset = new HashSet<>();
        List<Course> shuffledCourseList = courseList.stream().filter(c -> c.getClass() != Beverages.class).toList();
        Random rand = new Random();
        for (int i = 0; i <= 2; i++) {
            Course randomElement = shuffledCourseList.get(rand.nextInt(shuffledCourseList.size()));
            finalHashset.add(randomElement);
        }
        return finalHashset;
    }
    /**
     * Calculates the total price of the menu of the day
     * @return total price in a double variable
     */
    public double calculatePriceMenu() {
        double totalCost = 0;
        for (Course course : menuOfTheDay) {
            totalCost += course.getPrice();
        }
        totalCost = Math.floor(totalCost / 10) * 10;
        return totalCost;
    }
    /**
     * Calculates the total kcal of the menu of the day
     * @return sum of kcal in the menu  in a double variable
     */
    public double calculateKcalMenu(){
        double sumCourseKcal = 0 ;
        for (Course c : menuOfTheDay){
            sumCourseKcal += c.getCalories();
        }
        return Math.floor(sumCourseKcal);
    }
    /**
     * @return the price menu, or price menu discounted
     */
    public void calculateAndApplyDiscount(double discount) {
        double priceMenu = 0;
        for (Course c : menuOfTheDay) {
            priceMenu += c.getPrice();
        }
        System.out.println("\n\tPrice menu discounted:" + TextModifierEnum.ANSI_GREEN + " " +
                Math.floor((priceMenu / 100) * (100 - discount)) + "€" + TextModifierEnum.ANSI_RESET);
    }
}
