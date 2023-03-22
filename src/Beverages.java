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

    @Override
    public void printInfo(){
        super.printInfo();
    }
}
