import java.util.Set;

public class Beverages extends Course{
    private double milliliters;
    private boolean alcohol;

    /***
     * This is the constructor for the Beverages class
     * @param name        Beverage's name
     * @param description Beverage's description
     * @param milliliters Beverage's milliliters
     * @param calories    Beverage's calories
     * @param price       Beverage's price
     * @param mt          Beverage's menu type
     * @param allergens   Beverage's allergens
     */

    public Beverages(String name, String description, double milliliters,double calories, double price,MenuType mt, Set<AllergensEnum> allergens, boolean alcohol) {
        super(name, description, calories,price, mt, allergens);
        this.description = description + isAlcoholic(alcohol);
        this.milliliters = milliliters;
        this.courseType = CourseEnum.BEVERAGES;
    }

    public Beverages(String name, String description, double milliliters,double calories, double price,MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories,price, mt, allergens);
        this.milliliters = milliliters;
        this.courseType = CourseEnum.BEVERAGES;
    }

    public double getMilliliters() {return this.milliliters;}

    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}

    public String isAlcoholic(boolean alcohol) {
        String alcoholicWarning = "";
        if (alcohol) {
            alcoholicWarning = "Warning this beverage is alcoholic, you must show your ID";
        }
        return alcoholicWarning;
    }
}
