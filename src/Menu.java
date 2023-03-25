import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private List<Course> courseList;
    private List<Course> dailyMenu;
    TypeEnum type = TypeEnum.MEAT_BASED;

    public Menu() {
        dailyMenu = new ArrayList<>();
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {return courseList;}

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
}
