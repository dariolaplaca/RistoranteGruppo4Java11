//TODO Fare estendere course, cambiare gli attributi, il costruttore ed eliminare i getter e setters in eccesso
public class Firsts extends Course {


    //TODO inserire una sopraclasse portata e quindi far estendere tutto,
    //nome descrizione, prezzo, quello che volete, e i metodi a comune
    private String name;
    private String description;
    private double price;
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


    public String getName() {
        return this.name;
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
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        //TODO da sistemare
        super.printInfo();
    }

}
