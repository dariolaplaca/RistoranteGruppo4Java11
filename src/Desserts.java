import java.util.Set;

public class Desserts extends Course{
    private double weight;

    /**
     * @param name name of the dessert
     * @param description description of dessert
     * @param weight weight of dessert
     * @param price price of dessert
     */
    public Desserts(String name, String description, double weight, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.weight = weight;
        this.courseType = CourseEnum.DESSERTS;
    }
    //TODO setter
    public double getWeightDessert(){return weight;}
}