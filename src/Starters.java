import java.util.Set;

public class Starters extends Course {
    private double weight;

    /**
     * @param name        Starter's name
     * @param allergens   Set of allergens
     * @param description Starter's description
     * @param calories    calories of the Starter
     * @param price       price of the Starter
     */

    public Starters(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.STARTERS;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
