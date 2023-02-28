package src.items;

public class Seconds {
    private String name;
    private String description;
    private double price;
    private int weight;
    //Constructor
    public Seconds(String name, String description, double price, int weight) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }
    //Getter and setter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
