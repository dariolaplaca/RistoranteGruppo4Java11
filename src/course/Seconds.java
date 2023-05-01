package course;

import enumProject.AllergensEnum;
import enumProject.CourseEnum;
import enumProject.MenuTypeEnum;
import enumProject.TextModifierEnum;

import java.util.Set;

/**
 * course.Seconds class is an extension of course.Course that adding seconds to menu
 */
public class Seconds extends Course {

    private double weight;
    private boolean highProtein;
    private boolean contour;

    /***
     * This is the constructor for the course.Seconds class
     * @param name        Second's name
     * @param description Second's description
     * @param highProtein Second's quantity of protein
     * @param contour     Side dish of the second, if provided
     * @param weight      Second's weight
     * @param calories    Second's calories
     * @param price       Second's price
     * @param mt          Second's menu type
     * @param allergens   Second's allergens
     */

    public Seconds(String name, String description, boolean highProtein, boolean contour, double weight, double calories, double price, MenuTypeEnum mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.highProtein = highProtein;
        this.contour = contour;
        this.weight = weight;
        this.setCourseType(CourseEnum.SECONDS);

    }

    public boolean isHighProtein() {
        return this.highProtein;
    }

    public void setHighProtein(boolean highProtein) {
        this.highProtein = highProtein;
    }

    public boolean isContour() {
        return this.contour;
    }

    public void setContour(boolean contour) {
        this.contour = contour;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + " " + weight + "g" + TextModifierEnum.ANSI_RESET);
        if (!highProtein) {
            System.out.println(TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + "Low protein dish" + TextModifierEnum.ANSI_RESET);
        }
        if (!contour) {
            System.out.println(TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + "Dish without accompanying side" + TextModifierEnum.ANSI_RESET);
        }
    }
}
