import java.util.Set;

public class Firsts extends Course {
    private double weight;

    /**
     * @param name        First's name
     * @param description First's description
     * @param price       First's price
     * @param weight      First's weight
     */

    public Firsts(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        setCourseType(CourseEnum.FIRSTS);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
