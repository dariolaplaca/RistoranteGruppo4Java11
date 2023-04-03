import java.util.Set;

public class Desserts extends Course {

    /***
     * This is the constructor for the Desserts class
     * @param name        Dessert's name
     * @param description Dessert's description
     * @param weight      Dessert's weight
     * @param calories    Dessert's calories
     * @param price       Dessert's price
     * @param mt          Dessert's menu type
     * @param allergens   Dessert's allergens
     */

    public Desserts(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, weight, calories, price, mt, allergens);
        this.courseType = CourseEnum.DESSERTS;
    }

    public double getWeightDessert() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}
}