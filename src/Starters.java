import java.util.HashSet;
import java.util.Set;
public class Starters extends Course {
    private HashSet<Allergens> allergens;
    private double calories;

    /**
     * @param name
     * @param allergens
     * @param description
     * @param calories
     * @param price
     */

    public Starters(String name, Set<Allergens> allergens, String description, double calories, double price) {
        super(name, description, price);
        this.allergens = new HashSet<>(allergens);
        this.calories = calories;
    }
    public Starters(String name, String description, double calories, double price) {
        super(name, description, price);
        this.allergens = null;
        this.calories = calories;
    }

    public HashSet<Allergens> getAllergens() {return allergens;}
    public void setAllergens(HashSet<Allergens> allergens) {this.allergens = allergens;}

    public double getCalories() {return calories;}
    public void setCalories(double calories) {this.calories = calories;}

    @Override
    public void printInfo(){
        super.printInfo();
    }
}
