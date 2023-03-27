import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Firsts extends Course {
    private double weight;

    /**
     * @param name First's name
     * @param description First's description
     * @param price First's price
     * @param weight First's weight
     */

    public Firsts(String name, Set<Allergens> allergens, String description, double weight,double calories, double price,MenuType mt) {
        super(name, allergens,description,calories, price,mt);
        this.weight = weight;
    }
    public Firsts(String name, String description, double weight,double calories, double price,MenuType mt) {
        super(name, description,calories,price,mt);
        this.weight = weight;
    }

    public void setWeight(double weight) {this.weight = weight;}

@Override
    public void printInfo() {super.printInfo();}

    @Override
    public String printInfoClasse() {return "Firsts:";}

}
