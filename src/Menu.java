import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private List<Course> courseList;
    private List<Course> dailyMenu;
    private List<Course> listMenuVegan;
    private List<Course> listMenuFewKcal;
        MenuType type = MenuType.MENU;

    public Menu() {
        dailyMenu = new ArrayList<>();
        courseList = new ArrayList<>();
        listMenuVegan = new ArrayList<>();
        listMenuFewKcal = new ArrayList<>();
    }

    public List<Course> getCourseList() {return courseList;}
    public List<Course> getDailyMenu() {return dailyMenu;}
    public List<Course> getListMenuFewKcal() {return listMenuFewKcal;}

    public void addCourse(Course s) {courseList.add(s);}
    public void addAllCourse(List<Course> courseList) {this.courseList.addAll(courseList);}

    public HashSet<Course> popularCourses() {
        HashSet<Course> finalHashset = new HashSet<>();
        List<Course>shuffledCourseList = courseList.stream().filter(c -> c.getClass() != Beverages.class).collect(Collectors.toList());
        Collections.shuffle(shuffledCourseList);
        for (Course c : shuffledCourseList) {
            if(finalHashset.size() > 2){
                break;
            } else {
                finalHashset.add(c);
                c.printInfo();
            }
        }
        return finalHashset;
    }

    public void printMenu() {
        System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + type + " MENU" + TextModifier.ANSI_RESET + "\n");
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

    public void menuOfTheDay(){
        List<Course> shuffledList = courseList;
        Collections.shuffle(shuffledList);
        boolean starterFound = false;
        boolean firstFound = false;
        boolean secondFound = false;
        boolean dessertFound = false;
        boolean beverageFound = false;
        for (Course c : shuffledList) {
            if (c.getClass().equals(Starters.class) && !starterFound) {
                dailyMenu.add(c);
                starterFound = true;
            } else if (c.getClass().equals(Firsts.class) && !firstFound) {
                dailyMenu.add(c);
                firstFound = true;
            } else if (c.getClass().equals(Seconds.class) && !secondFound) {
                dailyMenu.add(c);
                secondFound = true;
            } else if (c.getClass().equals(Desserts.class) && !dessertFound) {
                dailyMenu.add(c);
                dessertFound = true;
            } else if (c.getClass().equals(Beverages.class) && !beverageFound) {
                dailyMenu.add(c);
                beverageFound = true;
            }
        }
        double totalCost = 0;
        for (Course c : dailyMenu){
            c.printInfo();
            totalCost += c.getPrice();
        }
        totalCost = Math.floor(totalCost/10) * 10;
        System.out.println("Total cost: " + totalCost + "€\n");
    }

    public void printMenuType(MenuType mt){
        boolean applicaScontoMenu ;

        switch (mt){
            case MEAT_MENU -> {
                applicaScontoMenu = false;
                type = MenuType.MEAT_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                meatMenu();
                if (applicaScontoMenu) {
                    System.out.println(discountApply(meatMenu(), 20));
                }
            }
            case FISH_MENU -> {
                applicaScontoMenu = false;
                type = MenuType.FISH_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                fishMenu();
                System.out.println(discountApply(fishMenu(), 20));

            }
            case VEGAN_MENU -> {
                applicaScontoMenu = false;
                type = MenuType.VEGAN_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                veganMenu();
                System.out.println(discountApply(veganMenu(), 20));

            }
            case FEW_KCAL_MENU -> {
                type = MenuType.FEW_KCAL_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                generateMenuFewKcal();
            }
        }
    }

    public List<Course> meatMenu(){
        List<Course> listMenuMeat = new ArrayList<>();
        courseList.forEach(c -> {
            if(c.getMt() != MenuType.MEAT_MENU){

            }else{
                listMenuMeat.add(c);
                System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
                c.printInfo();
            }
        });
            return listMenuMeat;
    }
    public List<Course> fishMenu(){
        List<Course> listMenuFish = new ArrayList<>();
        courseList.forEach(c -> {
                if(c.getMt() != MenuType.FISH_MENU){
                }else{
                    listMenuFish.add(c);
                    System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
                    c.printInfo();
                }
                }
        );
        return listMenuFish;
    }
public List<Course> veganMenu() {
    List<Course> listMenuVegan = new ArrayList<>();
    courseList.forEach(c -> {
                if(c.getMt() != MenuType.VEGAN_MENU){
                }else{
                    listMenuVegan.add(c);
                    System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
                    c.printInfo();
                }
            }
    );
    return listMenuVegan;
    }

    public List<Course> generateMenuFewKcal() {
        List<Course> shuffledList = courseList;
        Collections.shuffle(shuffledList);
        List<Course> menuBasseCalorie = new ArrayList<>();
        boolean starterFound = false;
        boolean firstFound = false;
        boolean secondFound = false;
        boolean dessertFound = false;
        boolean beverageFound = false;
        for (Course c : shuffledList) {
            if (c.getClass().equals(Starters.class) && !starterFound) {
                if (c.getCalories() < 500) {
                    menuBasseCalorie.add(c);
                    starterFound = true;
                }
            } else if (c.getClass().equals(Firsts.class) && !firstFound) {
                if (c.getCalories() < 500) {
                    menuBasseCalorie.add(c);
                    firstFound = true;
                }
            } else if (c.getClass().equals(Seconds.class) && !secondFound) {
                if (c.getCalories() < 500) {
                    menuBasseCalorie.add(c);
                    secondFound = true;
                }
            } else if (c.getClass().equals(Desserts.class) && !dessertFound) {
                if (c.getCalories() < 500) {
                    menuBasseCalorie.add(c);
                    dessertFound = true;
                }
            } else if (c.getClass().equals(Beverages.class) && !beverageFound) {
                if (c.getCalories() < 500) {
                    menuBasseCalorie.add(c);
                    beverageFound = true;
                }
            }
        }
        double sum = 0 ;
        for (Course c : menuBasseCalorie) {
            System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
            c.printInfo();
            sum += c.getCalories();
        }
            System.out.println("\nkcal in questo tipo menu: " + TextModifier.ANSI_RED + " " + sum +" kcal" + TextModifier.ANSI_RESET);
        return menuBasseCalorie;
    }
    public double discountApply(List<Course>l,double discount){
            double sumWithDiscount = 0 ;
            double sum = 0 ;
        for (Course c : l ) {
            sumWithDiscount += c.getPrice();
              sum += c.getPrice();
        }
        System.out.println("\n" + sum + "€" + " senza sconto");
        return (sumWithDiscount / 100) * (100 - discount);
    }
}

