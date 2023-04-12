package course;

import enumProject.AllergensEnum;
import enumProject.CourseEnum;
import enumProject.MenuTypeEnum;

import java.util.Set;
/**
 *
 */
public class Firsts extends Course {

    private double weight;
    /***
     * This is the constructor for the course.Firsts class
     * @param name        First's name
     * @param description First's description
     * @param weight      First's weight
     * @param calories    First's calories
     * @param price       First's price
     * @param mt          First's menu type
     * @param allergens   First's allergens
     */

    public Firsts(String name, String description, double weight, double calories, double price, MenuTypeEnum mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.FIRSTS;
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
}
