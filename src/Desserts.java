import java.util.HashSet;
import java.util.Set;

//TODO Fare estendere course, cambiare gli attributi, il costruttore ed eliminare i getter e setters in eccesso
//TODO Utilizzare l'enum TextModifier per i modificatori di testo ed eliminare le variabili in eccesso
public class Desserts {
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_DESCRIPTION_COLOR_AND_BACKGROUND = "\033[38;2;248;244;227;48;2;29;10;28m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_ITALIC = "\u001B[3m";
    private final String ANSI_BOLD = "\u001B[1m";

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
        System.out.println("\t" + ANSI_BOLD + this.name + ANSI_RESET +" - " + this.weight + "g "  + this.price + "€\n" + ANSI_RESET + "\n" + ANSI_ITALIC + ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + ANSI_YELLOW + this.description + ANSI_RESET);
    }
}
