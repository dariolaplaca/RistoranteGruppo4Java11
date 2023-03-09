import java.util.HashSet;
import java.util.Set;

public class Starters {
    private String name;
    private HashSet<String> ingredients;
    private  String description;
    private double calories;
    private double price;

    /**
     *
     * @param name
     * @param ingredients
     * @param description
     * @param calories
     * @param price
     */
    public Starters(String name, Set<String> ingredients, String description, double calories, double price) {
        this.name = name;
        this.ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.calories = calories;
        this.price = price;
    }
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public HashSet<String> getIngredients() {return this.ingredients;}
    public void setIngredients(HashSet<String> ingredients) {this.ingredients = ingredients;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public double getCalories() {return this.calories;}
    public void setCalories(double calories) {this.calories = calories;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}
    public void printInfo(){
        System.out.println("\t" + this.name + " - " + this.calories + "kcal" + " - " + this.price + "€\n" + this.description);
    }
}
