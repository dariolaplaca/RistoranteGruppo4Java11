package course;

import enumRestaurant.AllergensEnum;
import enumRestaurant.CourseEnum;
import enumRestaurant.MenuType;
import enumRestaurant.TextModifier;

import java.util.Set;
/**
 * course.Desserts class is an extension of course.Course that adding desserts to menu
 */
public class Desserts extends Course{
    private double weight;
    /**
     * @param name name of the dessert
     * @param description description of dessert
     * @param weight weight of dessert
     * @param price price of dessert
     */
    public Desserts(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.DESSERTS;
    }
    public double getWeight(){return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + " " +weight + "g" + TextModifier.ANSI_RESET);
    }
}