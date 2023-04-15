package enumProject;

public enum CourseEnum {

    //TODO difficile da mantenere, mettiamo un id tanto poi ci servirà per il db
    STARTERS("Starter", 0),
    FIRSTS("First", 20),
    SECONDS("Second", 40),
    DESSERTS("Dessert", 60),
    BEVERAGES("Beverage", 80);

    //TODO CAMBIARE ORDER IN ID E DARGLI VALORE DA 0 A 4
    public String name;
    public int order;

    CourseEnum(String name, int order){
        this.name = name;
        this.order = order;
    }
    public String getName() {return this.name;}
    //return this.id
    public int getOrder() {return this.order;}
}