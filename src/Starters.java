import java.util.HashSet;
import java.util.Set;

public class Starters {
    private String name;
    private HashSet<String> ingredients;
    private  String description;
    private double calories;
    private double price;
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_DESCRIPTION_COLOR_AND_BACKGROUND = "\033[38;2;248;244;227;48;2;29;10;28m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_ITALIC = "\u001B[3m";
    private final String ANSI_BOLD = "\u001B[1m";

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
        System.out.println("\t" + ANSI_YELLOW + ANSI_BOLD + this.name + ANSI_RESET + ANSI_YELLOW + " - " + this.calories + "kcal" + " - " + this.price + "€" +ANSI_RESET +"\n" +ANSI_ITALIC+ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + this.description + ANSI_RESET);
    }
}
