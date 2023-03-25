import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Desserts extends Course{
    private HashSet<Allergens> allergens;

    private HashSet<String> ingredients;
    private double weight;

    /**
     * @param name, name of the dessert
     * @param ingredients, ingredient list of each dessert
     * @param description, description of dessert
     * @param weight, weight of dessert
     * @param price, price of dessert
     */
    public Desserts(String name, Set<String> ingredients, String description, double weight, double price){
        super(name, description, price);
        this.ingredients = new HashSet<>(ingredients);
        this.weight = weight;
    }
    public Set<Allergens> getAllergens() {if (this.allergens == null) {return Collections.emptySet();} return this.allergens;}
    public HashSet<String> getIngredientsDessert(){return ingredients;}
    public void setIngredientsDessert(HashSet<String> ingredients){this.ingredients = ingredients;}

    public double getWeightDessert(){return weight;}
    public void setWeightDessert(double weight){this.weight = weight;}

    @Override
    public void printInfo(){
        super.printInfo();
    }

}