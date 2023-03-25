import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Seconds extends Course {
    private HashSet<Allergens> allergens;
    private int weight;
    /**
     *
     * @param name, name of the seconds
     * @param description, description of the seconds
     * @param price, price of seconds
     * @param weight, weight of seconds
     */

    public Seconds(String name, String description, double price, int weight) {
        super(name, description, price);
        this.weight = weight;

    }

    public Set<Allergens> getAllergens() {if (this.allergens == null) {return Collections.emptySet();} return this.allergens;}

    public int getWeight() {return this.weight;}

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo(){ super.printInfo(); }

}
