import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private String address;
    private String type;
    private List<Menu> menus;

    /***
     * This is the constructor for the Restaurant class
     * @param name Restaurant name
     */

    public Restaurant(String name, String address, String type){
        this.name = name;
        this.address = address;
        this.type = type;
        this.menus = new ArrayList<>();
    }
    // GETTER & SETTER
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public List<Menu> getMenu() {return menus;}
    public void setMenu(List<Menu> menu) {this.menus = menu;}
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

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
     * method that generate a type of menu
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

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_BOLD + TextModifier.ANSI_BRIGHT_RED + this.name + TextModifier.ANSI_RESET +
                "\n" + this.type + "\n" + this.address);
    }
}
