public class Beverages extends Course{
    private double milliliters;

    /**
     * @param name name of the Beverage
     * @param description description of the Beverage
     * @param milliliters  milliliters of each Beverage
     * @param price price of each Beverage
     *
     */

    public Beverages(String name, String description, double milliliters, double price) {
        super(name, description, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {return this.milliliters;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_RED + TextModifier.ANSI_BOLD + this.name + TextModifier.ANSI_RESET + TextModifier.ANSI_RED + " - " + this.price + "€" + TextModifier.ANSI_RESET + "\n" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + this.description + TextModifier.ANSI_RESET);
    }
}
