public enum MenuType {
    FISH_MENU("fish"),
    MENU("Menu"),
    VEGETARIAN("vegetarian"),
    MEAT_MENU("meat"),
    VEGAN_MENU("vegan"),
    VEGETARIAN_MENU("vegetarian"),
    FEW_KCAL_MENU("kcal");
    String menu;

    MenuType(String menu){
        this.menu = menu ;
    }
    public String getStringMenu() {return menu;}
}
