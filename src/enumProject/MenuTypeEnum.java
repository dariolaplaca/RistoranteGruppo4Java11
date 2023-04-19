package enumProject;

/**
 * that enum class is used to define the menu type
 */
public enum MenuTypeEnum {
    FISH_MENU("Fish"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    BEVERAGE_MENU("Beverages");

    public final String name;

    /***
     * This is the constructor for the menu type enum class
     * @param name Menu type name
     */

    MenuTypeEnum(String name){
        this.name = name ;
    }
    public String getName() {return name;}
}
