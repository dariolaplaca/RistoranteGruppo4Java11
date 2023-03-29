public enum MenuType {
    FISH_MENU("Fish"),
    MENU("Menu"),
    MEAT_MENU("Meat"),
    VEGAN_MENU("Vegan"),
    CHILDREN_MENU("Children"),
    VEGETARIAN_MENU("vegetarian"),
    FEW_KCAL_MENU("kcal");
    String menu;

    MenuType(String menu){
        this.menu = menu ;
    }
    public String getStringMenu() {return menu;}
}
