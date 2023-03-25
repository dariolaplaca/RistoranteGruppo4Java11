import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Desserts extends Course{
    private HashSet<Allergens> allergens;
    private HashSet<String> ingredients;
    private double weight;

    /**
     * @param name, name of the dessert
     * @param description, description of dessert
     * @param weight, weight of dessert
     * @param price, price of dessert
     */
    public Desserts(String name, Set<Allergens> allergens, String description, double weight, double price){
        super(name, description, price);
        this.ingredients = new HashSet<>(ingredients);
        this.weight = weight;
        this.allergens = new HashSet<>(allergens);
    }

    public HashSet<String> getIngredientsDessert(){return ingredients;}
    public void setIngredientsDessert(HashSet<String> ingredients){this.ingredients = ingredients;}

    public double getWeightDessert(){return weight;}
    public void setWeightDessert(double weight){this.weight = weight;}

    @Override
    public void printInfo(){
        super.printInfo();
    }

}