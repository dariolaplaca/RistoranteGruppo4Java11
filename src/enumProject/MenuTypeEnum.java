package enumProject;

public enum MenuTypeEnum {
    FISH_MENU("Fish"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    BEVERAGE_MENU("Beverages");

    public String name;

    MenuTypeEnum(String menu){
        this.name = menu ;
    }
    public String getName() {return name;}
}
