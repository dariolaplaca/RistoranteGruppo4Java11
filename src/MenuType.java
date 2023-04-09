public enum MenuType {
    FISH_MENU("Fish"),
    MENU("Whole"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    FEW_KCAL_MENU("Low KCal");

    private final String name;

    MenuType(String menu){
        this.name = menu ;
    }
    public String getName() {return name;}
}
