import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    //TODO info ristorante e sicuramente il tipo

    private String name;
    private List<Menu> menus;

    /***
     * This is the constructor for the Restaurant class
     * @param name Restaurant name
     */

    public Restaurant(String name){
        this.name = name;
        this.menus = new ArrayList<>();
    }
    // GETTER & SETTER
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public List<Menu> getMenu() {return menus;}
    public void setMenu(List<Menu> menu) {this.menus = menu;}
    public void addMenu(Menu mt ){ menus.add(mt);}
    public void addAllMenu(List<Menu> mt){ menus.addAll(mt);}

    /**
     * print restaurant menus
     */
    public void printAllMenus() {
        System.out.println("\n\tMenu " + this.name + ":\n");
        menus.forEach(m -> System.out.println("\t"+m.getName()));
    }

    /***
     * method that print a type of menu with a user input
     * @param menuName name of the menu to return
     */
    public Menu chooseOneMenu(String menuName) {
        for(Menu menu : menus){
            if(menu.getName().equals(menuName)){
               menu.generateMenu();
               return menu;
            }
        }
        return null;
    }
}
