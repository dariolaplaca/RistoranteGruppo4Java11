import java.util.Set;

public class Starters extends Course {

    private double weight;
    /***
     * This is the constructor for the Starters class
     * @param name        Starter's name
     * @param description Starter's description
     * @param weight      Starter's weight
     * @param calories    Starter's calories
     * @param price       Starter's price
     * @param mt          Starter's menu type
     * @param allergens   Starter's allergens
     */

    public Starters(String name, String description, double weight, double calories, double price,MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.STARTERS;
    }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}
}
