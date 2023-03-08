public class Firsts {

        // ATTRIBUTES
        private String name;
        private  String description;
        private double price;
        private double weight;


        //TODO inserire il javadoc https://www.baeldung.com/javadoc
    /**
     *
     * @param name
     * @param description
     * @param price
     * @param weight
     */
        public Firsts(String name, String description, double price, double weight) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.weight = weight;
        }

    /**
     * Questo metodo stampa le info di un primo piatto
     */
    public void printInfo(){
        System.out.println("\t" + this.name + " " + this.weight + "g "  + this.price + "€\n" + this.description);
    }

        // GETTERS
        public String getName() {return this.name;}
        public String getDescription() {return description;}
        public double getPrice() {return this.price;}


        // SETTERS
        public void setName(String name) {this.name = name;}
        public void setDescription(String description) {this.description = description;}
        public void setPrice(double price) {this.price = price;}
    }
