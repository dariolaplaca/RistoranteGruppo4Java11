package course;

import enumProject.AllergensEnum;
import enumProject.CourseEnum;
import enumProject.MenuTypeEnum;
import enumProject.TextModifierEnum;

import java.util.Set;

/**
 * course.Starters class is an extension of course.Course that adding starters to menu
 */
public class Starters extends Course {

    private Boolean isGourmet;

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

    public Starters(String name, String description, boolean isGourmet, double calories, double price, MenuTypeEnum mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.isGourmet = isGourmet;
        this.setCourseType(CourseEnum.STARTERS);
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
        if (isGourmet) {
            System.out.println("\t" +
                    TextModifierEnum.ANSI_BOLD +
                    TextModifierEnum.ANSI_RED +
                    TextModifierEnum.ANSI_RESET +
                    TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND +
                    TextModifierEnum.ANSI_ITALIC + "Is gourmet!" + TextModifierEnum.ANSI_RESET);
        } else {
            System.out.println("\t" +
                    TextModifierEnum.ANSI_BOLD +
                    TextModifierEnum.ANSI_RED +
                    TextModifierEnum.ANSI_RESET +
                    TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND +
                    TextModifierEnum.ANSI_ITALIC + "Is not gourmet!" + TextModifierEnum.ANSI_RESET);
        }

    }
}
