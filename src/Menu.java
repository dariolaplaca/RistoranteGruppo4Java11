import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Course> courseList;
    private List<Firsts> firstsList;
    private List<Seconds> secondList;
    private List<Desserts> dessertsList;
    private List<Beverages> beveragesList;
    TypeEnum type = TypeEnum.MEAT_BASED;

    public Menu() {
        courseList = new ArrayList<>();
        firstsList = new ArrayList<>();
        secondList = new ArrayList<>();
        dessertsList = new ArrayList<>();
        beveragesList = new ArrayList<>();
    }


    public List<Starters> getStartersList() {return startersList;}
    public void addPortata(Course s) {courseList.add(s);}


    public void printMenu() {
        final String emoji_sparkles = "\u2728";
        System.out.println("\n\t" + emoji_sparkles + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + "STARTERS" + TextModifier.ANSI_RESET + emoji_sparkles + "\n");
        for (Course s : courseList) {
            s.printInfo();
            System.out.println();
        }
    }




}
