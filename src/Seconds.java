public class Seconds {
    private String name;
    private String description;
    private double price;
    private int weight;
    /**
     *
     * @param name
     * @param description
     * @param price
     * @param weight
     */
    public Seconds(String name, String description, double price, int weight) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("\t" + this.name + " " + this.weight + "g" + " - " + this.price + "€\n" + this.description);
    }
}
