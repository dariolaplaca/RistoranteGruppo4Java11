import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private List<Course> courseList;
    private List<Course> dailyMenu;
        MenuType type = MenuType.MENU;

    public Menu() {
        dailyMenu = new ArrayList<>();
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {return courseList;}
    public List<Course> getDailyMenu() {return dailyMenu;}

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
    
    public void menuOfTheDay() {
        dailyMenu.clear();
        List<Course> shuffledList = courseList;
        Collections.shuffle(shuffledList);
        HashSet<Class<? extends Course>> classSet = new HashSet<>();
        for (Course c : shuffledList) {
            Class<? extends Course> courseClass = c.getClass();
            if (!classSet.contains(courseClass)) {
                dailyMenu.add(c);
                classSet.add(courseClass);
            }
        }
        double totalCost = 0;
        dailyMenu.sort(Comparator.comparingInt(a -> a.courseType.order));
        for (Course c : dailyMenu) {
            c.printInfo();
            totalCost += c.getPrice();
        }
        totalCost = Math.floor(totalCost / 10) * 10;
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
                    discountApply(meatMenu(), 20);
                }
            }
            case FISH_MENU -> {
                applicaScontoMenu = true;
                type = MenuType.FISH_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                fishMenu();
                if (applicaScontoMenu) {
                    discountApply(fishMenu(), 20);
                }
            }
            case VEGAN_MENU -> {
                applicaScontoMenu = true;
                type = MenuType.VEGAN_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                veganMenu();
                discountApply(veganMenu(), 20);
                if (applicaScontoMenu) {
                    discountApply(veganMenu(), 20);
                }
            }
            case FEW_KCAL_MENU -> {
                applicaScontoMenu = false;
                type = MenuType.FEW_KCAL_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                generateMenuFewKcal();
                if (applicaScontoMenu) {
                    discountApply(fishMenu(), 20);
                }
            }
            case CHILDREN_MENU -> {
                applicaScontoMenu = false;
                type = MenuType.CHILDREN_MENU;
                System.out.println(TextModifier.ANSI_RED + " " + type + TextModifier.ANSI_RESET);
                childrenMenu();
                if (applicaScontoMenu) {
                    discountApply(childrenMenu(), 20);
                }
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
        calculatePriceMenu(listMenuMeat);
            return listMenuMeat;
    }

    public List<Course> fishMenu() {
        double sum = 0;
        List<Course> listMenuFish = new ArrayList<>();
        courseList.forEach(c -> {
                    if (c.getMt() != MenuType.FISH_MENU) {
                    } else {
                        listMenuFish.add(c);
                        System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
                        c.printInfo();
                    }
                }
        );
        calculatePriceMenu(listMenuFish);
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
    calculatePriceMenu(listMenuVegan);
    return listMenuVegan;
    }

    public List<Course> childrenMenu() {
        List<Course> listMenuChildren = new ArrayList<>();
        courseList.forEach(c -> {
            if (c.getMt() != MenuType.CHILDREN_MENU) {
            } else {
                listMenuChildren.add(c);
                System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
                c.printInfo();
            }
        });
        calculatePriceMenu(listMenuChildren);
        return listMenuChildren;
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
        double sum = 0;
        for (Course c : menuBasseCalorie) {
            System.out.println(TextModifier.ANSI_YELLOW + c.printInfoClasse() + TextModifier.ANSI_RESET);
            c.printInfo();
            sum += c.getCalories();
        }
        System.out.println("\nkcal in questo tipo menu: " + TextModifier.ANSI_RED + " " + sum + " kcal" + TextModifier.ANSI_RESET);
        calculatePriceMenu(menuBasseCalorie);
        return menuBasseCalorie;
    }

    public void discountApply(List<Course> l, double discount) {
        double sumWithDiscount = 0;
        double sum = 0;
        for (Course c : l) {
            sumWithDiscount += c.getPrice();
            sum += c.getPrice();
        }
        System.out.println("\n" + sum + "€" + " senza sconto");
        System.out.println((sumWithDiscount / 100) * (100 - discount));
    }

    public double calculatePriceMenu(List<Course>l){
        double sum = 0;
        for (Course list : l) {
            sum += list.getPrice();
        }
        System.out.println("\n\tPrezzo menu: "+sum + "€");
        return sum;
    }
}

