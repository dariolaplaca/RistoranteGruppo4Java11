public enum CourseEnum {
    STARTERS("Starter", 0),
    FIRSTS("First", 20),
    SECONDS("Second", 40),
    DESSERTS("Dessert", 60),
    BEVERAGES("Beverage", 80);

    //TODO i modificatoriiii di accesso e i getter per favore
    String name;
    int order;

    CourseEnum(String name, int order){
        this.name = name;
        this.order = order;
    }
}