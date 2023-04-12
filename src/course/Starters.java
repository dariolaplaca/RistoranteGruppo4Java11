package course;

import enumRestaurant.AllergensEnum;
import enumRestaurant.CourseEnum;
import enumRestaurant.MenuType;
import enumRestaurant.TextModifier;

import java.util.Set;

public class Starters extends Course {

    private boolean isGourmet;

    /***
     * This is the constructor for the course.Starters class
     * @param name        Starter's name
     * @param description Starter's description
     * @param isGourmet   Starter's gourmet status
     * @param calories    Starter's calories
     * @param price       Starter's price
     * @param mt          Starter's menu type
     * @param allergens   Starter's allergens
     */

    public Starters(String name, String description, boolean isGourmet, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.isGourmet = isGourmet;
        this.courseType = CourseEnum.STARTERS;
    }

    public boolean isGourmet() {
        return isGourmet;
    }

    public void setGourmet(boolean gourmet) {
        isGourmet = gourmet;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (isGourmet == true){
            System.out.println("\t" +
                    TextModifier.ANSI_BOLD +
                    TextModifier.ANSI_RED  +
                    TextModifier.ANSI_RESET +
                    TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND +
                    TextModifier.ANSI_ITALIC +  "Is gourmet!" + TextModifier.ANSI_RESET);
        }else {
            System.out.println("\t" +
                    TextModifier.ANSI_BOLD +
                    TextModifier.ANSI_RED  +
                    TextModifier.ANSI_RESET +
                    TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND +
                    TextModifier.ANSI_ITALIC +  "Is not gourmet!" + TextModifier.ANSI_RESET);
        }

    }
}
