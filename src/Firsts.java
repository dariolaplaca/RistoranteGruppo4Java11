import java.util.Set;

public class Firsts extends Course {

    /***
     * This is the constructor for the Firsts class
     * @param name        First's name
     * @param description First's description
     * @param weight      First's weight
     * @param calories    First's calories
     * @param price       First's price
     * @param mt          First's menu type
     * @param allergens   First's allergens
     */

    public Firsts(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, weight, calories, price, mt, allergens);
        this.courseType = CourseEnum.FIRSTS;
    }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}
}
