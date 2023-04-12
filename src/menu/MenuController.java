package menu;

import course.Beverages;
import course.Course;
import enumRestaurant.MenuType;
import enumRestaurant.TextModifierEnum;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    private List<Course> fullMenu;

    public MenuController() {
        this.fullMenu = new ArrayList<>();
    }

    public List<Course> getFullMenu() {return fullMenu;}
    public void setFullMenu(List<Course> fullMenu) {this.fullMenu = fullMenu;}

    public void addAllCourse(List<Course> c){fullMenu.addAll(c);}

    /**
     * that method print all course in to menu
     */
    public void printAllCourses(){
            Course currentCourseClass = fullMenu.get(fullMenu.size()-1);
        for (Course course : fullMenu){
            if(currentCourseClass.getClass() != course.getClass()){
                System.out.println("\n\t" + TextModifierEnum.ANSI_UNDERLINE + TextModifierEnum.ANSI_BOLD +
                        TextModifierEnum.ANSI_BRIGHT_RED + "\t" + course.getClass().getSimpleName() + TextModifierEnum.ANSI_RESET);
                currentCourseClass = course;
            }
                course.printInfo();
        }
    }

    public List<Course> generateMeatMenu() {
        List<Course> meatMenu = new ArrayList<>();
        meatMenu.addAll(fullMenu.stream().filter(c -> c.getMenuType().equals(MenuType.MEAT_MENU)).toList());
        addAllDrink(meatMenu);
        return meatMenu;
    }

    public List<Course> generateFishMenu() {
        List<Course> fishMenu = new ArrayList<>();
        fishMenu.addAll(fullMenu.stream().filter(c -> c.getMenuType().equals(MenuType.CHILDREN_MENU)).toList());
        addAllDrink(fishMenu);
        return fishMenu;
    }

    public List<Course> generateChildrenMenu() {
        List<Course> childrenMenu = new ArrayList<>();
        childrenMenu.addAll(fullMenu.stream().filter(c -> c.getMenuType().equals(MenuType.CHILDREN_MENU)).toList());
        addAllDrink(childrenMenu);
        return childrenMenu;
    }

    public List<Course> generateVeganMenu() {
        List<Course> veganMenu = new ArrayList<>();
        veganMenu.addAll(fullMenu.stream().filter(c -> c.getMenuType().equals(MenuType.VEGAN_MENU)).toList());
        addAllDrink(veganMenu);
        return veganMenu;
    }

    public List<Course> generateFewKcalMenu() {
        List<Course> fewKcalMenu = new ArrayList<>();
        fewKcalMenu.addAll(fullMenu.stream().filter(c -> c.getCalories() < 500).toList());
        return fewKcalMenu;
    }

    public void addAllDrink(List<Course> currentMenu) {
        for (Course beverage : fullMenu) {
            if (beverage.getClass() == Beverages.class) {
                currentMenu.add(beverage);
            }
        }
    }
}
