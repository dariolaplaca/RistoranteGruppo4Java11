import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.*;

public class Menu {

    private List<Course> courseList;
    private List<Course> currentMenu;
    private MenuType menuType;
    private String name;

    /***
     * This is the constructor for the Menu class
     * @param name     Menu name
     * @param menuType Menu type
     */
    public Menu(String name, MenuType menuType) {
        this.menuType = menuType;
        this.name = name;
        this.courseList = new ArrayList<>();
        this.currentMenu = new ArrayList<>();
    }

    public List<Course> getCourseList() {return courseList;}
    public void setCourseList(List<Course> courseList) {this.courseList = courseList;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public MenuType getMenuType() {return this.menuType;}
    public void setMenuType(MenuType menuType) {this.menuType = menuType;}

    public List<Course> getCurrentMenu() {return this.currentMenu;}
    public void setCurrentMenu(List<Course> currentMenu) {this.currentMenu = currentMenu;}

    public void addCourse(Course s) {courseList.add(s);}
    public void addAllCourse(List<Course> courseList) {this.courseList.addAll(courseList);}

    /**
     * Prints all the courses of the menu
     */
    public void printMenu() {
        System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + menuType.getName() + " MENU" + TextModifier.ANSI_RESET + "\n");
        Course currentCourse = courseList.get(courseList.size() - 1);
        for (Course c : courseList) {
            if (currentCourse.getClass() != c.getClass()) {
                System.out.println("\n\t" + TextModifier.ANSI_UNDERLINE + TextModifier.ANSI_BOLD + TextModifier.ANSI_BRIGHT_RED + "\t" + c.getClass().getName() + TextModifier.ANSI_RESET);
                currentCourse = c;
            }
            c.printInfo();
            System.out.println();
        }
    }

    /**
     * Generate a Menu that contains a course of each type
     */
    public void generateMenu() {
        System.out.println("" + TextModifier.ANSI_BOLD + TextModifier.ANSI_BRIGHT_YELLOW + TextModifier.ANSI_UNDERLINE + menuType.getName() + " Menu" + TextModifier.ANSI_RESET);
        addOneDifferentCourseOfEachType();
        currentMenu.sort(Comparator.comparingInt(a -> a.courseType.getOrder()));
        for (Course c : currentMenu) {
            System.out.print(TextModifier.ANSI_GREEN + c.getClass().getName() + ": " + TextModifier.ANSI_RESET);
            c.printInfo();
            System.out.println();
        }
        if (menuType == MenuType.FEW_KCAL_MENU) {
            double sumKcalMenu = calculateKcalMenu();
            calculateAndApplyDiscount();
            System.out.println(TextModifier.ANSI_GREEN + "\n\tTotal Kcal: " + sumKcalMenu + TextModifier.ANSI_RESET);
        }
    }

    /**
     * Adds a course of each type to the current menu
     */
    private void addOneDifferentCourseOfEachType() {
//        currentMenu.clear();
        List<Course> shuffledList = new ArrayList<>(courseList);
        Collections.shuffle(shuffledList);
        HashSet<Class<? extends Course>> classSet = new HashSet<>();
        for (Course c : shuffledList) {
            Class<? extends Course> courseClass = c.getClass();
            if (!classSet.contains(courseClass)) {
                currentMenu.add(c);
                classSet.add(courseClass);
            }
        }
    }

    /**
     * @check if menu contains allergens
     */
    public void checkAllergens() {
        HashSet<AllergensEnum> newHash = new HashSet<>();
        for (Course c : currentMenu) {
            if (c.getAllergens().equals(AllergensEnum.NONE)) {
                System.out.println(TextModifier.ANSI_GREEN + "Allergens not present" + AllergensEnum.NONE.getName() + TextModifier.ANSI_RESET);
            } else {
                c.getAllergens().forEach(a -> newHash.add(a));
            }
        }
        System.out.print(TextModifier.ANSI_RED + "Attention please, allergens present: [ " + TextModifier.ANSI_RESET);
        newHash.forEach(a -> System.out.print(TextModifier.ANSI_YELLOW + a.getName() + ", " + TextModifier.ANSI_RESET));
        System.out.print(TextModifier.ANSI_RED + " ]" + TextModifier.ANSI_RESET);
    }

    /**
     * @return the price menu, or price menu discounted
     */
    public void calculateAndApplyDiscount() {
        Scanner insertNumberForDiscount = new Scanner(System.in);
        Scanner ifDiscountString = new Scanner(System.in);
        double priceMenu = 0;
        System.out.println(TextModifier.ANSI_BOLD + "Do you want to discount the current menu...???" + TextModifier.ANSI_RESET);
        String yesOrNo = ifDiscountString.nextLine();
        for (Course c : currentMenu) {
            priceMenu += c.getPrice();
        }
        if (yesOrNo.strip().equals("yes")) {
            System.out.println(TextModifier.ANSI_BRIGHT_PURPLE + " \n\tPrice menu: " + Math.floor(priceMenu) + "€" + TextModifier.ANSI_RESET);
            System.out.println(TextModifier.ANSI_YELLOW + " \n\tPlease insert a discount..." + TextModifier.ANSI_RESET);
            double sc = insertNumberForDiscount.nextInt();
            System.out.println("\n\tPrice menu discounted:" + TextModifier.ANSI_GREEN + " " + Math.floor((priceMenu / 100) * (100 - sc)) + "€" + TextModifier.ANSI_RESET);
        } else if (yesOrNo.equals("no")) {
            System.out.println("\n\tPrezzo menu: " + TextModifier.ANSI_RED + " " + Math.floor(priceMenu) + "€" + TextModifier.ANSI_RESET);
        }
    }
    /**
     * @return an HashSet of 3 randoms courses that are not Beverages
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
     * Calculates the total price of the current menu
     * @return total price in a double variable
     */
    public double calculatePriceMenu() {
        double totalCost = 0;
        for (Course course : currentMenu) {
            totalCost += course.getPrice();
        }
        totalCost = Math.floor(totalCost / 10) * 10;
        return totalCost;
    }
    /**
     * Calculates the total kcal of the current menu
     * @return sum of kcal in the menu  in a double variable
     */
    public double calculateKcalMenu(){
        double sumCourseKcal = 0 ;
        for (Course c : currentMenu){
            sumCourseKcal += c.getCalories();
        }
        return Math.floor(sumCourseKcal);
    }
}
