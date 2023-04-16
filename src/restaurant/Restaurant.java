package restaurant;

import course.Course;
import enumProject.MenuTypeEnum;
import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;
import menu.Menu;

import java.util.ArrayList;
import java.util.Comparator;
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
    //TODO aggiungere un double cashRegister da impostare a 0 nel costruttore
    private Menu menu;
    private HashMap<Table, Customer> tables;

    /**
     * This is the constructor for the Restaurant class
     */
    public Restaurant(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.menu = new Menu("Menu");
        tables = new HashMap<>();
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
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
    public void addCourseToMenu(Course course) {
        menu.addCourse(course);
    }

    public void addAllCourseToMenu(List<Course> courses) {
        menu.addAllCourse(courses);
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
     * method that generate a type of menu
     *
     * @param menuType type of the menu to return
     */

    public List<Course> chooseOneMenu(MenuTypeEnum menuType) {
        List<Course> listToReturn = new ArrayList<>();
        for (Course course : menu.getCourseList()){
            if(course.getMenuType().equals(menuType) || course.getMenuType().equals(MenuTypeEnum.BEVERAGE_MENU)){
                listToReturn.add(course);
            }
        }
        listToReturn.sort(Comparator.comparingInt(a -> a.getCourseType().getOrder()));
        for (Course c : listToReturn) {
            System.out.print(TextModifierEnum.ANSI_GREEN + c.getClass().getSimpleName() + ": " + TextModifierEnum.ANSI_RESET);
            c.printInfo();
            System.out.println();
        }
        return listToReturn;
    }

    /**
     * Adds a course to the order of the customer
     * only if the customer sit in the table, and it's a course of the menu type he chose
     * @param course course to add
     * @param customer customer that ordered the course
     */
    public void addCourseToCustomer(Course course, Customer customer){
        if(tables.containsValue(customer) && course.getMenuType() == customer.getMenuType()){
            customer.addOrderedCourse(course);
        } else {
            System.out.println("Can't add course to the customer");
        }
    }

    /**
     * Adds a table to the table map of the Restaurant
     * @param table table to add
     */
    public void addTable(Table table) {
        tables.put(table, null);
    }

    /**
     * This method books an available table for a customer
     * @param table Table the customer wants to book
     * @param customer Customer that wants to book the table
     * @param numberOfPeople number of people in the group of the customer
     */
    public void bookATable(Table table, Customer customer, int numberOfPeople) {
        if(table.getTableState() == TableStateEnum.AVAILABLE){
            if (table.getNumberOfSeats() < numberOfPeople) {
                System.out.println("The table n° " + table.getId() + " is not suited for the group");
            } else {
                table.bookTable(customer);
                tables.put(table, customer);
            }
        } else {
            System.out.println("This table is already booked!");
        }
    }

    /**
     * Free a booked table
     * @param table
     */
    public void freeTable(Table table) {
        if(table.getTableState() == TableStateEnum.OCCUPIED){
            //TODO prendere il cliente dalla mappa e stampiamo il conto totale e lo aggiungiamo al cashRegister
            table.freeTable();
            tables.put(table, null);
        } else {
            System.out.println("This table is already free");
        }
    }

    /**
     *  Prints the info's of all the tables
     */
    public void printTablesInfo() {
        for (Table table : tables.keySet()) {
            table.printInfo();
            System.out.println();
        }
    }

    /**
     * Prints the list of all the available tables
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
     * Prints the list of all the occupied tables
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
