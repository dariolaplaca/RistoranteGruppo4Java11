package enumProject;

/**
 * that enum class is used to define the course type
 */
public enum CourseEnum {

    STARTERS("Starter", 0),
    FIRSTS("First", 1),
    SECONDS("Second", 2),
    DESSERTS("Dessert", 3),
    BEVERAGES("Beverage", 4);

    public final String name;
    public final int id;
    public final int NUMBER_OF_COURSES_TYPE = 4;

    /***
     * This is the constructor for the course type enum class
     * @param name  The course type
     * @param id    The course type identifier
     */

    CourseEnum(String name, int id){
        this.name = name;
        if (id < 0 || id > NUMBER_OF_COURSES_TYPE) {
            throw new IllegalArgumentException("ID can only be between 0 to 4.");
        }
        this.id = id;
    }
    public String getName() {return this.name;}

    public int getId() {
        return this.id;
    }
}