import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    private String name;
    private List<Menu>menu;

    public Restaurant(String name){
        this.name = name;
        this.menu = new ArrayList<>();
    }
    // GETTER & SETTER
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public List<Menu> getMenu() {return menu;}
    public void setMenu(List<Menu> menu) {this.menu = menu;}
    public List<Menu> getMeatMenu() {return menu;}
    public void setMeatMenu(List<Menu> meatMenu) {this.menu = meatMenu;}
    public void addMenu(Menu mt ){ menu.add(mt);}
    public void addAllMenu(List<Menu> mt){ menu.addAll(mt);}

    /**
     * print restaurant menus
     */
    public void menus() {
        System.out.println("\n\tMenu " + this.name + ":\n");
        menu.forEach(m -> System.out.println("\t"+m.getName()));
    }

    /**
     *
     * @param meatMenu
     * @param fishMenu
     * @param veganMenu
     * @param fewKcalMenu
     * method that print a type of menu
     */
    public void chooseOneMenu(Menu meatMenu, Menu fishMenu, Menu veganMenu, Menu fewKcalMenu) {
        System.out.println("\n\tChoose your menu, please insert the exact name of menu");
        Scanner newScanner = new Scanner(System.in);
        String str = newScanner.nextLine();
        switch (str){
            case"Meat menu":
                meatMenu.generateMenu();
                break;
            case"Fish menu":
                fishMenu.generateMenu();
                break;
            case"Vegan menu":
                veganMenu.generateMenu();
                break;
            case"Low kcal menu":
                fewKcalMenu.generateMenu();
                break;
            default:
                System.out.println("You can choose one type menu");
        }
    }
}
