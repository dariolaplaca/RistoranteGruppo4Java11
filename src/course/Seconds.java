package course;

import enumRestaurant.AllergensEnum;
import enumRestaurant.CourseEnum;
import enumRestaurant.MenuType;

import java.util.Set;

public class Seconds extends Course {

    private double weight;
    /***
     * This is the constructor for the course.Seconds class
     * @param name        Second's name
     * @param description Second's description
     * @param weight      Second's weight
     * @param calories    Second's calories
     * @param price       Second's price
     * @param mt          Second's menu type
     * @param allergens   Second's allergens
     */

    public Seconds(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.SECONDS;
    }

    public double getWeight() {return this.weight;}
    public void setWeight(double weight) {this.weight = weight;}

}
