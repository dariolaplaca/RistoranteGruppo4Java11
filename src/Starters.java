import java.util.Set;

public class Starters extends Course {

    private boolean isGourmet;

    /***
     * This is the constructor for the Starters class
     * @param name        Starter's name
     * @param description Starter's description
     * @param isGourmet   Starter's gourmet status
     * @param calories    Starter's calories
     * @param price       Starter's price
     * @param mt          Starter's menu type
     * @param allergens   Starter's allergens
     */

    public Starters(String name, String description, boolean isGourmet, double calories, double price, MenuType mt, Set<AllergensEnum> allergens) {
        super(name, description, calories, price, mt, allergens);
        this.isGourmet = isGourmet;
        this.courseType = CourseEnum.STARTERS;
    }

    public boolean isGourmet() {
        return isGourmet;
    }

    public void setGourmet(boolean gourmet) {
        isGourmet = gourmet;
    }
}
