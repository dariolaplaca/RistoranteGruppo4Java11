package restaurant;

import course.Course;
import enumProject.BeverageTypeEnum;
import enumProject.MenuTypeEnum;
import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;
import menu.Menu;

import java.util.*;

/**
 * The restaurant class manages the info and the logic of the restaurant
 * It manages all the tables in the Restaurant with all the related methods
 */
public class Restaurant {

    private String name;
    private String address;
    private String type;
    private Menu menu;
    private HashMap<Table, Customer> tables;
    //TODO aggiungere un double cashRegister da impostare a 0 nel costruttore
    private List<Double> cashRegister;
    /**
     * This is the constructor for the Restaurant class
     */
    public Restaurant(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.menu = new Menu("Menu");
        this.tables = new HashMap<>();
        this.cashRegister = new ArrayList<>();
    }

    // GETTER & SETTER
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Menu getMenu() {return menu;}
    public String getAddress() {return this.address;}
    public void setAddress(String address) {this.address = address;}
    public String getType() {return this.type;}
    public void setType(String type) {this.type = type;}
    public HashMap<Table, Customer> getTables() {return this.tables;}

    // METHODS
    public void addCourseToMenu(Course course) {menu.addCourse(course);}
    public void addAllCourseToMenu(List<Course> courses) {menu.addAllCourse(courses);}
    /**
     * that method print info of restaurant
     */
    public void printInfo() {
        System.out.println("\t" + TextModifierEnum.ANSI_ITALIC + TextModifierEnum.ANSI_BOLD +
                TextModifierEnum.ANSI_BRIGHT_RED + this.name + TextModifierEnum.ANSI_RESET +
                "\n" + this.type + "\n" + this.address);
    }

    /**
     * method that generate a type of menu with plus courses
     * you can choose the course
     */
    public List<Course> chooseCourseMenuType(MenuTypeEnum menuType) {
        List<Course> listToReturn = new ArrayList<>();
        for (Course course : menu.getCourseList()) {
            if (course.getMenuType().equals(menuType) || course.getMenuType().equals(MenuTypeEnum.MENU)) {
                listToReturn.add(course);
            }
        }
        listToReturn.sort(Comparator.comparingInt(a -> a.getCourseType().getOrder()));
        listToReturn.forEach(c -> {
            System.out.print(TextModifierEnum.ANSI_GREEN + c.getClass().getSimpleName() + ": " + TextModifierEnum.ANSI_RESET);
            c.printInfo();
            System.out.println();
        });
        return listToReturn;
    }

    /**
     * that method can print of menu with only one course
     */
    public List<Course> generateAMenuType(MenuTypeEnum menuTypeEnum) {
        List<Course> listCourse = new ArrayList<>();
        HashSet setClass = new HashSet();
        for (Course course : menu.getCourseList()) {
            Class<? extends Course> currentClass = course.getClass();
            if (course.getMenuType().equals(menuTypeEnum) || course.getMenuType().equals(MenuTypeEnum.MENU)) {
                if (!setClass.contains(currentClass)) {
                    listCourse.add(course);
                    setClass.add(currentClass);
                }
            }
        }
        listCourse.sort(Comparator.comparingInt(a -> a.getCourseType().getOrder()));
        listCourse.forEach(c -> {
            System.out.println(TextModifierEnum.ANSI_GREEN + c.getClass().getSimpleName() + TextModifierEnum.ANSI_RESET);
            c.printInfo();
            System.out.println();
        });
        return listCourse;
    }

    /**
     * Adds a course to the order of the customer
     * only if the customer sit in the table, and it's a course of the menu type he chose
     */
    public void addCourseToCustomer(Course course, Customer customer) {
        if (tables.containsValue(customer) && course.getMenuType() == customer.getMenuType()) {
            customer.addOrderedCourse(course);
        } else {
            System.out.println("Can't add course to the customer");
        }
    }

    /**
     * Adds a table to the table map of the Restaurant
     */
    public void addTable(Table table) {
        tables.put(table, null);
    }

    /**
     * Remove table
     */
    public void removeTable(Table table) {
        boolean removeTable = false;
        for (Table t : tables.keySet()) {
            if (table.equals(t)) {
                tables.remove(table);
                removeTable = true;
            }
        }
        if (!removeTable) {
            System.out.println(TextModifierEnum.ANSI_RED + "table not found");
        }
    }

    /**
     * This method books an available table for a customer
     * takes an input method that returns the list of all available tables
     * @param table          Table the customer wants to book
     * @param customer       Customer that wants to book the table
     * @param numberOfPeople number of people in the group of the customer
     */
    public void bookATable(Table table, Customer customer, int numberOfPeople) {
        List<Table> tableListAvailable = listOfAvailableTables();
        if (table.getTableState() == TableStateEnum.AVAILABLE) {
            if (table.getNumberOfSeats() < numberOfPeople) {
                System.out.println("The table n° " + table.getId() + " is not suited for the group");
                generateTable(numberOfPeople, tableListAvailable);
            } else {
                table.bookTable(customer);
                tables.put(table, customer);
                System.out.println(TextModifierEnum.ANSI_GREEN + "You have booked with success"+ TextModifierEnum.ANSI_RESET);
            }
        } else {
            System.out.println("\n" + TextModifierEnum.ANSI_RED + "This table is already book!" + TextModifierEnum.ANSI_RESET + " Table number: " + table.getId());
            for (Table t : tableListAvailable) {
                int numberDiPostiInPiu = t.getNumberOfSeats() - numberOfPeople;
                if (numberDiPostiInPiu == 0 || (numberDiPostiInPiu>= 0 && numberDiPostiInPiu <= 2)) {
                    System.out.println(TextModifierEnum.ANSI_GREEN + "You can book this table:" + TextModifierEnum.ANSI_RESET);
                    t.printInfo();
                }
                // TODO implementare un feedBack che nessun'tavolo disponibile al momento
            }
        }
    }
    /**
     * That method print the table having available seats
     * @param numberOfPeople
     * @param tableList
     */
    private void generateTable(int numberOfPeople, List<Table> tableList) {
        for (Table t : tableList) {
            int numberDiPostiInPiu = t.getNumberOfSeats() - numberOfPeople;
            if (numberDiPostiInPiu == 0 || (numberDiPostiInPiu>= 0 && numberDiPostiInPiu <= 2)) {
                t.printInfo();
                System.out.println();
            }
        }
    }

    /**
     * Free a booked table
     */
    public void freeTable(Table table) {
        if (table.getTableState() == TableStateEnum.OCCUPIED) {
            //TODO prendere il cliente dalla mappa e stampiamo il conto totale e lo aggiungiamo al cashRegister
            // da rivedere ancora non completo
            for (Map.Entry<Table,Customer> customerEntry : tables.entrySet()){
                System.out.println(customerEntry.getValue().getOrderedCourses());
            }
            table.freeTable();
            tables.put(table, null);
        } else {
            System.out.println("This table is already free");
        }
    }

    /**
     * Prints the list of all the available tables
     */
    public List<Table> listOfAvailableTables() {
        List<Table> tableList = new ArrayList<>();
//        System.out.println("\nAVAILABLE TABLES:\n");
        for (Table table : tables.keySet()) {
            if (table.getTableState() == TableStateEnum.AVAILABLE) {
                tableList.add(table);
            }
        }
        return tableList;
    }
    public void printAvailableTables() {
        List<Table> tableList = new ArrayList<>();
        System.out.println("\nAVAILABLE TABLES:\n");
        for (Table table : tables.keySet()) {
            if (table.getTableState() == TableStateEnum.AVAILABLE) {
                tableList.add(table);
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

    /**
     * Prints the info's of all the tables
     */
    public void printTablesInfo() {
        for (Table table : tables.keySet()) {
            table.printInfo();
            System.out.println();
        }
    }
}
