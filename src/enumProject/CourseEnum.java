package enumProject;

/**
 * that enum class is used to define the course type
 */
public enum CourseEnum {

    FIRSTS("First", 1),
    STARTERS("Starter", 0),
    SECONDS("Second", 2),
    DESSERTS("Dessert", 3),
    BEVERAGES("Beverage", 4);

    public final String name;
    public final Integer id;

    /***
     * This is the constructor for the course type enum class
     * @param name  The course type
     * @param id    The course type identifier
     */

    CourseEnum(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }
}