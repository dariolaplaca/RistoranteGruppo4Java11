import java.util.Set;




public class Desserts extends Course{

    //TODO se devo stampare le info dei figli come faccio, quindi super.print() e poi la stampa degli altri figli
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
    public double getWeight(){return weight;}
    public void setWeight(double weight) {this.weight = weight;}
}