public class Beverages{
    private String name;
    private String description;
    private double milliliters;
    private double price;

    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_DESCRIPTION_COLOR_AND_BACKGROUND = "\033[38;2;248;244;227;48;2;29;10;28m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_ITALIC = "\u001B[3m";
    private final String ANSI_BOLD = "\u001B[1m";

    /**
     * @param name
     * @param description
     * @param milliliters
     * @param price
     */

    public Beverages(String name, String description, double milliliters, double price) {
        this.name = name;
        this.description = description;
        this.milliliters = milliliters;
        this.price = price;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}
    public double getMilliliters() {return this.milliliters;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public void printInfo(){
        System.out.println("\t" + ANSI_RED + ANSI_BOLD + this.name + ANSI_RESET + ANSI_RED + " - " + this.price + "€" + ANSI_RESET + "\n" + ANSI_ITALIC + ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + this.description + ANSI_RESET);
    }
}
