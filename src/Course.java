import java.util.*;

public abstract class  Course {
    protected String name;
    protected String description;
    protected double price;
    protected HashSet<Allergens> allergens;

    public Course(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        allergens = new HashSet<>();
    }
    public Course(String name, String description, double price, Set<Allergens> allergens) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.allergens = new HashSet<>(allergens);
    }

    public Set<Allergens> getAllergens() {return this.allergens;}
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_BOLD + TextModifier.ANSI_RED + this.name + TextModifier.ANSI_RESET + " - " +this.price + "€\n" + TextModifier.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND + TextModifier.ANSI_ITALIC + this.description + TextModifier.ANSI_RESET);
    };

    public void checkAllergens() {
        Set<Allergens> allergens = this.getAllergens();
        if (allergens.isEmpty()) {
            System.out.println(TextModifier.ANSI_RED + getName() + TextModifier.ANSI_RESET + " is safe to eat.");
        } else {
            System.out.print(TextModifier.ANSI_BRIGHT_YELLOW + "Warning: " + TextModifier.ANSI_RESET + TextModifier.ANSI_BRIGHT_RED + getName() + TextModifier.ANSI_RESET + " contains ");
            for (Allergens allergen : allergens) {
                System.out.print("["+allergen.getName() + "] ");
            }
        } System.out.println();
    }
}
