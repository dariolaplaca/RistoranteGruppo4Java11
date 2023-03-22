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
    public void allAllCourse(List<Course> list) {
        courseList.addAll(list);
    }


    public void printMenu() {

        System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + type + TextModifier.ANSI_RESET + "\n");
        for (Course c : courseList) {
            c.printInfo();
            System.out.println();
        }
    }




}
