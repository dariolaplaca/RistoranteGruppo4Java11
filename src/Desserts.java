import java.util.HashSet;
import java.util.Set;

public class Desserts extends Course{

    private HashSet<String> ingredients;
    private double weight;

    /**
     * @param name, name of the dessert
     * @param ingredients, ingredient list of each dessert
     * @param description, description of dessert
     * @param weight, weight of dessert
     * @param price, price of dessert
     */

    Desserts(String name, Set<String> ingredients, String description, double weight, double price){
        super(name, description, price);
        this.ingredients = new HashSet<>(ingredients);
        this.weight = weight;
    }
    public HashSet<String> getIngredientsDessert(){return ingredients;}
    public void setIngredientsDessert(HashSet<String> ingredients){this.ingredients = ingredients;}

    public double getWeightDessert(){return weight;}
    public void setWeightDessert(double weight){this.weight = weight;}

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_BOLD + this.name + TextModifier.ANSI_RESET +" - " + this.weight + "g "  + this.price + "€\n" + TextModifier.ANSI_RESET + "\n" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + TextModifier.ANSI_YELLOW + this.description +TextModifier.ANSI_RESET);
    }
}
