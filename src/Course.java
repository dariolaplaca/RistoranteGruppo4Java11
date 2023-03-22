public abstract class  Course {
    protected String name;
    protected String description;

    protected double price;

    public Course(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}
    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_BOLD + TextModifier.ANSI_PURPLE + this.name + TextModifier.ANSI_RESET + " - " +this.price + "€\n" + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + this.description + TextModifier.ANSI_RESET);
    };
}
