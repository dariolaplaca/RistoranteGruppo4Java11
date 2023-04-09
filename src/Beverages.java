import java.util.Set;

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

    @Override
    public String getDescription(){
        if(isAlcoholic){
            return description + TextModifier.ANSI_RESET + "\n" + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + "Warning this beverage is alcoholic, you must show your ID" + TextModifier.ANSI_RESET;
        } else{
            return description;
        }
    }
}
