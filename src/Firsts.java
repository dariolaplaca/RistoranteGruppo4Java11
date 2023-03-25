import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Firsts extends Course {
    private double weight;

    /**
     * @param name First's name
     * @param description First's description
     * @param price First's price
     * @param weight First's weight
     */

    public Firsts(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }
    public Firsts(String name, String description, double price, double weight, Set<Allergens> allergens) {
        super(name, description, price, allergens);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        super.printInfo();
    }

}
