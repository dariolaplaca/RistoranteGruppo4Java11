package enumProject;

public enum MenuTypeEnum {

    //TODO rivedere lasciamo solo FISH_MENU, MEAT_MENU, VEGAN_MENU, CHILDREN_MENU, BEVERAGE_MENU
    FISH_MENU("Fish"),
    MENU("Whole"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    BEVERAGE_MENU("Beverages"),
    FEW_KCAL_MENU("Low KCal");

    public String name;

    MenuTypeEnum(String menu){
        this.name = menu ;
    }
    public String getName() {return name;}
}
