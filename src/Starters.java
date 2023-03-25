import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Starters extends Course {
    private double calories;

    /**
     * @param name Starter's name
     * @param allergens Set of allergens
     * @param description Starter's description
     * @param calories calories of the Starter
     * @param price price of the Starter
     */

    public Starters(String name, Set<Allergens> allergens, String description, double calories, double price) {
        super(name, description, price, allergens);
        this.calories = calories;
    }
    public Starters(String name, String description, double calories, double price) {
        super(name, description, price);
        this.calories = calories;
    }

    public double getCalories() {return calories;}
    public void setCalories(double calories) {this.calories = calories;}

    @Override
    public void printInfo(){
        super.printInfo();
    }

}
