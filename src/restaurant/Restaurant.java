package restaurant;

import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;
import menu.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The restaurant class manages the info and the logic of the restaurant
 * It manages all the tables in the Restaurant with all the related methods
 */
public class Restaurant {

    private String name;
    private String address;
    private String type;
    private List<Menu> menus;
    private HashMap<Table, Customer> tables;

    /**
     * This is the constructor for the Restaurant class
     */
    public Restaurant(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.menus = new ArrayList<>();
        tables = new HashMap<>();
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenu() {
        return menus;
    }

    public void setMenu(List<Menu> menu) {
        this.menus = menu;
    }

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

    public HashMap<Table, Customer> getTables() {
        return this.tables;
    }

    // METHODS
    public void addMenu(Menu mt) {
        menus.add(mt);
    }

    public void addAllMenu(List<Menu> mt) {
        menus.addAll(mt);
    }

    /**
     * that method print info of restaurant
     */
    public void printInfo() {
        System.out.println("\t" + TextModifierEnum.ANSI_ITALIC + TextModifierEnum.ANSI_BOLD +
                TextModifierEnum.ANSI_BRIGHT_RED + this.name + TextModifierEnum.ANSI_RESET +
                "\n" + this.type + "\n" + this.address);
    }

    /**
     * print restaurant menus
     */
    public void printAllMenus() {
        System.out.println("\n\tmenu.Menu " + this.name + ":\n");
        menus.forEach(m -> System.out.println("\t" + m.getName()));
    }

    /**
     * method that generate a type of menu
     *
     * @param menuName name of the menu to return
     */
    public Menu chooseOneMenu(String menuName) {
        for (Menu menu : menus) {
            if (menu.getName().toLowerCase().equals(menuName.toLowerCase())) {
                menu.generateMenu();
                return menu;
            }
        }
        return null;
    }

    /**
     * @param table
     */
    public void addTable(Table table) {
        tables.put(table, null);
    }

    /**
     * @param table
     * @param customer
     * @param numberOfPeople
     */
    public void bookATable(Table table, Customer customer, int numberOfPeople) {
        if (table.getNumberOfSeats() < numberOfPeople) {
            System.out.println("The table n° " + table.getId() + " is not suited for the group");
        } else {
            table.bookTable(customer);
            tables.put(table, customer);
        }
    }

    /**
     * @param table
     */
    public void freeTable(Table table) {
        table.freeTable();
        tables.put(table, null);
    }

    /**
     *
     */
    public void printTablesInfo() {
        for (Table table : tables.keySet()) {
            table.printInfo();
            System.out.println();
        }
    }

    /**
     *
     */
    public void printAvailableTables() {
        System.out.println("\nAVAILABLE TABLES:\n");
        for (Table table : tables.keySet()) {
            if (table.getTableState() == TableStateEnum.AVAILABLE) {
                table.printInfo();
                System.out.println();
            }
        }
    }

    /**
     *
     */
    public void printOccupiedTables() {
        System.out.println("\nOCCUPIED TABLES:\n");
        for (Table table : tables.keySet()) {
            if (table.getTableState() == TableStateEnum.OCCUPIED) {
                table.printInfo();
                System.out.println();
            }
        }
    }
}
