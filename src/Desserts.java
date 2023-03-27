import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Desserts extends Course{
    private double weight;

    /**
     * @param name name of the dessert
     * @param description description of dessert
     * @param weight weight of dessert
     * @param price price of dessert
     */
    public Desserts(String name, Set<Allergens> allergens, String description, double weight,double calories, double price,MenuType mt) {
        super(name, allergens,description, calories,price,mt);
        this.weight = weight;
    }
    public double getWeightDessert(){return weight;}

    @Override
    public void printInfo(){super.printInfo();}
    @Override
    public String printInfoClasse() {return "Desserts:";}
}