package src.items;

public class Starters {

    // ATTRIBUTES
    private String name;
    private String ingredients;
    private  String description;
    private double calories;
    private double price;

    //CONSTRUCTOR
    public Starters(String name, String ingredients, String description, double calories, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    // GETTERS
    public String getName() {return this.name;}
    public String getIngredients() {return this.ingredients;}
    public String getDescription() {return description;}
    public double getCalories() {return this.calories;}
    public double getPrice() {return this.price;}


    // SETTERS
    public void setName(String name) {this.name = name;}
    public void setIngredients(String ingredients) {this.ingredients = ingredients;}
    public void setDescription(String description) {this.description = description;}
    public void setCalories(double calories) {this.calories = calories;}
    public void setPrice(double price) {this.price = price;}
}
