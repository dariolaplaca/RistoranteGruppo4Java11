package enumProject;

public enum CourseEnum {

    STARTERS("Starter", 0),
    FIRSTS("First", 1),
    SECONDS("Second", 2),
    DESSERTS("Dessert", 3),
    BEVERAGES("Beverage", 4);

    public String name;
    public int id;

    CourseEnum(String name, int id){
        this.name = name;
        if (id < 0 || id > 4) {
            throw new IllegalArgumentException("ID can only be between 0 to 4.");
        }
        this.id = id;
    }
    public String getName() {return this.name;}
    //return this.id
    public int getOrder() {return this.id;}
}