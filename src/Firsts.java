public class Firsts extends Course {
    private double weight;

    /**
     * @param name
     * @param description
     * @param price
     * @param weight
     */

    public Firsts(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        super.printInfo();
    }
}
