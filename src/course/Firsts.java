package course;

import enumProject.AllergensEnum;
import enumProject.CourseEnum;
import enumProject.MenuTypeEnum;
import enumProject.TextModifierEnum;

import java.util.Set;

/**
 * course.Firsts class is an extension of course.Course that adding firsts to menu
 */

public class Firsts extends Course {

    private Double weight;
    private Boolean isAColdCourse;

    /***
     * This is the constructor for the course.Firsts class
     * @param name        First's name
     * @param description First's description
     * @param isCold      First's temperature
     * @param weight      First's weight
     * @param calories    First's calories
     * @param price       First's price
     * @param mt          First's menu type
     * @param allergens   First's allergens
     */

    public Firsts(String name, String description, boolean isCold, double weight, double calories, double price, MenuTypeEnum mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.isAColdCourse = isCold;
        this.weight = weight;
        this.setCourseType(CourseEnum.FIRSTS);
    }

    public boolean isAColdCourse() {
        return this.isAColdCourse;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + " " + weight + "g" + TextModifierEnum.ANSI_RESET);
        if (isAColdCourse) {
            System.out.println(TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + "This dish is a cold course" + TextModifierEnum.ANSI_RESET);
        }
    }
}