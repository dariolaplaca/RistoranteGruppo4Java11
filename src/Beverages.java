import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Beverages extends Course{
    private HashSet<Allergens> allergens;
    private double milliliters;

    /**
     * @param name name of the Beverage
     * @param description description of the Beverage
     * @param milliliters  milliliters of each Beverage
     * @param price price of each Beverage
     *
     */

    public Beverages(String name, String description, double milliliters, double price) {
        super(name, description, price);
        this.milliliters = milliliters;
    }

    public Set<Allergens> getAllergens() {if (this.allergens == null) {return Collections.emptySet();} return this.allergens;}
    public double getMilliliters() {return this.milliliters;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}

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
