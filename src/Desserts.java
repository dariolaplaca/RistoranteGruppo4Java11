public class Desserts {
    // ATTRIBUTES
    private String name;
    private String ingredients;
    private String description;
    private double weight;
    private double price;

    // CONSTRUCTOR
    Desserts(String name, String ingredients,String description, double weight, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    // METHODS
    public void printInfo(){
        System.out.println(" - Dessert : " + getNameDessert());
        System.out.println("     - Ingredients : " + getIngredientsDessert());
        System.out.println("     - Description : " + getDescriptionDessert());
        System.out.println("     - Weight : " + getWeightDessert() + " g ");
        System.out.println("     - Price :  " + getPriceDessert() + "€ ");
//        System.out.println("Dessert : " + name + "Description : " + description + " weight : " + weight + " price : " + price)
    }




    // GETTERS
    public String getNameDessert(){return name;}
    public String getIngredientsDessert(){return ingredients;}
    public String getDescriptionDessert(){return description;}
    public double getWeightDessert(){return weight;}
    public double getPriceDessert(){return price;}
    // SETTERS
    public void setNameDessert(String name){this.name = name;}
    public void setIngredientsDessert(String ingredients){this.ingredients = ingredients;}
    public void setDescriptionDessert(String description){this.name = description;}
    public void setWeightDessert(double weight){this.weight = weight;}
    public void setPriceDessert(double price){this.price = price ;}
}
