import java.util.*;

public class Menu {

    private List<Course> courseList;
    private List<Course> currentMenu;
    private MenuType menuType;
    private String name;

    public Menu(String name, MenuType menuType) {
        this.menuType = menuType;
        this.name = name;
        courseList = new ArrayList<>();
        currentMenu = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return this.menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public List<Course> getCurrentMenu() {
        return this.currentMenu;
    }

    public void setCurrentMenu(List<Course> currentMenu) {
        this.currentMenu = currentMenu;
    }

    public void addCourse(Course s) {
        courseList.add(s);
    }

    public void addAllCourse(List<Course> courseList) {
        this.courseList.addAll(courseList);
    }


    /**
     * Prints all the courses of the menu
     *
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
        double totalCost = calculatePriceMenu();
        for(Course c : currentMenu){
            c.printInfo();
            System.out.println();
        }
        System.out.println(TextModifier.ANSI_YELLOW + "\n\tMenu Price: " + totalCost + "€" + TextModifier.ANSI_RESET);
        if (menuType == MenuType.FEW_KCAL_MENU) {
            double calories = 0;
            for (Course c : currentMenu) {
                calories += c.getCalories();
            }
            System.out.println(TextModifier.ANSI_GREEN + "\n\tTotal Kcal: " + calories + TextModifier.ANSI_RESET);
        }
    }

    /**
     * Adds a course of each type to the current menu
     */
    private void addOneDifferentCourseOfEachType() {
        currentMenu.clear();
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
     * Calculates the total price of the current menu
     *
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

}
