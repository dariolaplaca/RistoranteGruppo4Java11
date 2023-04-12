package restaurant;

import enumRestaurant.TableStateEnum;
import enumRestaurant.TextModifier;
import menu.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant {

    private String name;
    private String address;
    private String type;
    private List<Menu> menus;
    private HashMap<Table, TableStateEnum> tables;

    /***
     * This is the constructor for the restaurant.Restaurant class
     * @param name restaurant.Restaurant name
     */

    public Restaurant(String name, String address, String type){
        this.name = name;
        this.address = address;
        this.type = type;
        this.menus = new ArrayList<>();
        tables = new HashMap<>();
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

    public HashMap<Table, TableStateEnum> getTables() {
        return this.tables;
    }

    public void setTables(HashMap<Table, TableStateEnum> tables) {
        this.tables = tables;
    }

    public void addMenu(Menu mt ){ menus.add(mt);}
    public void addAllMenu(List<Menu> mt){ menus.addAll(mt);}

    /**
     * print restaurant menus
     */
    public void printAllMenus() {
        System.out.println("\n\tmenu.Menu " + this.name + ":\n");
        menus.forEach(m -> System.out.println("\t"+m.getName()));
    }

    /**
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

    public void addTable(Table table){
        tables.put(table, TableStateEnum.AVAILABLE);
    }

    public void bookATable(Table table, Customer customer, int numberOfPeople){
        if(table.getNumberOfSeats() < numberOfPeople){
            System.out.println("The table n° " + table.getId() + " is not suited for the group");
        } else {
            table.bookTable(customer);
            tables.put(table, TableStateEnum.OCCUPIED);
        }
    }

    public void freeTable(Table table){
        table.freeTable();
        tables.put(table, TableStateEnum.AVAILABLE);
    }

    public void printTablesInfo(){
        for(Table table : tables.keySet()){
            table.printInfo();
            System.out.println(tables.get(table) + "\n");
        }
    }

    public void printAvailableTables(){
        System.out.println("\nAVAILABLE TABLES:\n");
        for(Table table : tables.keySet()){
            if(tables.get(table) == TableStateEnum.AVAILABLE){
                table.printInfo();
                System.out.println();
            }
        }
    }

    public void printOccupiedTables(){
        System.out.println("\nOCCUPIED TABLES:\n");
        for(Table table : tables.keySet()){
            if(tables.get(table) == TableStateEnum.OCCUPIED){
                table.printInfo();
                System.out.println();
            }
        }
    }

    public void printInfo(){
        System.out.println("\t" + TextModifier.ANSI_ITALIC + TextModifier.ANSI_BOLD + TextModifier.ANSI_BRIGHT_RED + this.name + TextModifier.ANSI_RESET +
                "\n" + this.type + "\n" + this.address);
    }
}
