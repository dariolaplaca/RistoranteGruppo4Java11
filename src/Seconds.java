import java.util.HashSet;
import java.util.Set;


public class Seconds extends Course {
    private HashSet<String> ingredients;

    private int weight;
    /**
     *
     * @param name, name of the seconds
     * @param description, description of the seconds
     * @param price, price of seconds
     * @param weight, weight of seconds
     * @param ingredients, ingredient list of seconds
     */
    public Seconds(String name, String description, double price, int weight, Set<String> ingredients) {
        super(name, description, price);
        this.weight = weight;
        this.ingredients = new HashSet<>(ingredients);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_BOLD + this.name + TextModifier.ANSI_RESET +" - " + this.weight + "g "  + this.price + "€\n" + TextModifier.ANSI_RESET + "\n" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + TextModifier.ANSI_PURPLE + this.description +TextModifier.ANSI_RESET);
    }
}
