import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Beverages extends Course{
    private double milliliters;

    /**
     * @param name name of the Beverage
     * @param description description of the Beverage
     * @param milliliters  milliliters of each Beverage
     * @param price price of each Beverage
     *
     */
    //TODO Dario dai una sistemata
    public Beverages(String name, String description, double milliliters,double calories, double price,MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories,price, mt, allergens);
        this.milliliters = milliliters;
        setCourseType(CourseEnum.BEVERAGES);
    }

    public double getMilliliters() {return this.milliliters;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}

    @Override
    public void printInfo(){super.printInfo();}

    //TODO
    @Override
    public String printInfoClasse() {return "Beverage:";}

}
