import java.util.Collections;
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

    public Set<Allergens> getAllergens() {if (this.allergens == null) {return Collections.emptySet();} return this.allergens;}
    public void setAllergens(HashSet<Allergens> allergens) {this.allergens = allergens;}

    public double getCalories() {return calories;}
    public void setCalories(double calories) {this.calories = calories;}

    @Override
    public void printInfo(){
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
