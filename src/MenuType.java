public enum MenuType {
    FISH_MENU("Fish"),
    MENU("Whole Menu"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    VEGETARIAN_MENU("Vegetarian"),
    FEW_KCAL_MENU("Low KCal");

    private final String name;

    MenuType(String menu){
        this.name = menu ;
    }
    public String getName() {return name;}
}
