public enum CourseEnum {
    STARTERS("Starter", 0),
    FIRSTS("First", 20),
    SECONDS("Second", 40),
    DESSERTS("Dessert", 60),
    BEVERAGES("Beverage", 80);

    protected final String name;
    protected final int order;

    CourseEnum(String name, int order){
        this.name = name;
        this.order = order;
    }
    public String getName() {return this.name;}
    public int getOrder() {return this.order;}
}