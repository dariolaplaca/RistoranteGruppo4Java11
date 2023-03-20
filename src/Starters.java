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

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_YELLOW + TextModifier.ANSI_BOLD + this.name + TextModifier.ANSI_RESET + TextModifier.ANSI_YELLOW + " - " +
                this.calories + "kcal" + " - " + this.price + "€" + TextModifier.ANSI_RESET +"\n" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + this.description + TextModifier.ANSI_RESET);
    }
}
