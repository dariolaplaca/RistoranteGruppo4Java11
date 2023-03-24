import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Firsts extends Course {
    private HashSet<Allergens> allergens;
    private double weight;

    /**
     * @param name
     * @param description
     * @param price
     * @param weight
     */

    public Firsts(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }

    public Set<Allergens> getAllergens() {if (this.allergens == null) {return Collections.emptySet();} return this.allergens;}
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void checkAllergens() {
        Set<Allergens> allergens = this.getAllergens();
        if (allergens.isEmpty()) {
            System.out.println("This dish is safe to eat.");
        } else {
            System.out.print("Warning: This dish contains ");
            for (Allergens allergen : allergens) {
                System.out.print(allergen.toString().toLowerCase() + ", ");
            }
        } System.out.println();
    }
}
