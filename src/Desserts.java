import java.util.HashSet;
import java.util.Set;

public class Desserts {

    private String name;
    private HashSet<String> ingredients;
    private String description;
    private double weight;
    private double price;

    /**
     * @param name
     * @param ingredients
     * @param description
     * @param weight
     * @param price
     */

    Desserts(String name, Set<String> ingredients, String description, double weight, double price){
        this.name = name;
        this.ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public String getNameDessert(){return name;}
    public void setNameDessert(String name){this.name = name;}

    public HashSet getIngredientsDessert(){return ingredients;}
    public void setIngredientsDessert(HashSet ingredients){this.ingredients = ingredients;}

    public String getDescriptionDessert(){return description;}
    public void setDescriptionDessert(String description){this.name = description;}

    public double getWeightDessert(){return weight;}
    public void setWeightDessert(double weight){this.weight = weight;}

    public double getPriceDessert(){return price;}
    public void setPriceDessert(double price){this.price = price ;}

    public void printInfo(){
        System.out.println("\t" + this.name + " " + this.weight + "g "  + this.price + "€\n" + this.description);
    }
}
