import java.util.HashSet;
import java.util.Set;
public class Starters extends Course {
    private HashSet<String> ingredients;
    private double calories;

    /**
     * @param name
     * @param ingredients
     * @param description
     * @param calories
     * @param price
     */

    public Starters(String name, Set<String> ingredients, String description, double calories, double price) {
        super(name, description, price);
        this.ingredients = new HashSet<>(ingredients);
        this.calories = calories;
    }

    public HashSet<String> getIngredients() {return ingredients;}
    public void setIngredients(HashSet<String> ingredients) {this.ingredients = ingredients;}
    public double getCalories() {return calories;}
    public void setCalories(double calories) {this.calories = calories;}

    @Override
    public void printInfo(){
        super.printInfo();
    }
}
