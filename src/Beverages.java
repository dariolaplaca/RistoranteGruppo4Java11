import java.util.Set;

/**
 * Beverages class is an extension of Course that implements drinks
 */

public class Beverages extends Course {
    private double milliliters;
    private boolean isAlcoholic;

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

    public Beverages(String name, String description, double milliliters, double calories, double price, MenuType mt, Set<AllergensEnum> allergens, boolean alcohol) {
        super(name, description, calories, price, mt, allergens);
        this.description = description;
        this.milliliters = milliliters;
        this.isAlcoholic = alcohol;
        this.courseType = CourseEnum.BEVERAGES;
    }

    public double getMilliliters() {return this.milliliters;}

    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}

    public boolean isAlcoholic() {
        return this.isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println(TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + String.valueOf(this.milliliters) + "ml" + TextModifier.ANSI_RESET);
        if(isAlcoholic){
            System.out.println(TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + "Warning this beverage is alcoholic, you must show your ID" + TextModifier.ANSI_RESET);
        }
    }
}
