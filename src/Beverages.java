public class Beverages{


    // ATTRIBUTES
    private String name;
    private String description;
    private double milliliters;
    private double price;


    //CONSTRUCTOR
    public Beverages(String name, String description, double milliliters, double price) {
        this.name = name;
        this.description = description;
        this.milliliters = milliliters;
        this.price = price;
    }


    // GETTERS
    public String getName() {return this.name;}
    public String getDescription() {return this.description;}
    public double getMilliliters() {return this.milliliters;}
    public double getPrice() {return this.price;}


    // SETTERS
    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}
    public void setPrice(double price) {this.price = price;}

    public void printInfo(){
        System.out.println("\t" + this.name + " " + this.milliliters + "ml" + " - " + this.price + "€\n" + this.description);
    }
}
