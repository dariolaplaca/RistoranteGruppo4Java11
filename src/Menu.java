import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Course> courseList;
    TypeEnum type = TypeEnum.MEAT_BASED;

    public Menu() {
        courseList = new ArrayList<>();
    }


    public List<Course> getCourseList() {return courseList;}
    public void addCourse(Course s) {courseList.add(s);}
    public void addAllCourse(List<Course> courseList) {this.courseList.addAll(courseList);}



    public void printMenu() {
        System.out.println("\n\t"+ TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + type + " MENU" + TextModifier.ANSI_RESET + "\n");
        Course currentCourse = courseList.get(courseList.size() - 1);
        for (Course c : courseList) {
            if(currentCourse.getClass() != c.getClass()){
                System.out.println("\n\t" + TextModifier.ANSI_UNDERLINE + TextModifier.ANSI_BOLD + TextModifier.ANSI_BRIGHT_RED + "\t" + c.getClass().getCanonicalName() + TextModifier.ANSI_RESET);
                currentCourse = c;
            }
            c.printInfo();
            System.out.println();
        }
    }
}
