public class Desserts {
    // ATTRIBUTES
    private String name;
    private String description;
    private double weight;
    private double price;

    // CONSTRUCTOR
    Desserts(String name, String description, double weight, double price){
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    // GETTERS
    public String getNameDessert(){return name;}
    public String getDescriptionDessert(){return description;}
    public double getWeightDessert(){return weight;}
    public double getPriceDessert(){return price;}
    // SETTERS
    public void setNameDessert(String name){this.name = name;}
    public void setDescriptionDessert(String description){this.name = description;}
    public void setWeightDessert(double weight){this.weight = weight;}
    public void setPriceDessert(double price){this.price = price ;}
}
