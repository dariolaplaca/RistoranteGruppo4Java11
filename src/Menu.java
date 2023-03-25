import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    private List<Course> courseList;
    TypeEnum type = TypeEnum.MEAT_BASED;

    public Menu() {
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
}
