import java.util.HashSet;
import java.util.Set;

public class Desserts {
    // ATTRIBUTES
    private String name;
    private HashSet<String> ingredients;
    private String description;
    private double weight;
    private double price;

    // CONSTRUCTOR
    Desserts(String name, Set<String> ingredients, String description, double weight, double price){
        this.name = name;
        this.ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    //TODO prima i field poi costruttore getter setter e altri metodi
    // METHODS
    public void printInfo(){
        System.out.println("\t" + this.name + " " + this.weight + "g "  + this.price + "€\n" + this.description);
    }




    // GETTERS
    public String getNameDessert(){return name;}
    public HashSet getIngredientsDessert(){return ingredients;}
    public String getDescriptionDessert(){return description;}
    public double getWeightDessert(){return weight;}
    public double getPriceDessert(){return price;}
    // SETTERS
    public void setNameDessert(String name){this.name = name;}
    public void setIngredientsDessert(HashSet ingredients){this.ingredients = ingredients;}
    public void setDescriptionDessert(String description){this.name = description;}
    public void setWeightDessert(double weight){this.weight = weight;}
    public void setPriceDessert(double price){this.price = price ;}
}
