package restaurant;

import course.Course;
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
    private HashMap<Table, Customer> tablesRestaurant;
    private Double cashRegister;
    private Integer maxNumberOfCustomers;
    private Integer numberOfCurrentCustomers;


    /**
     * This is the constructor for the Restaurant class
     */

    public Restaurant(String name, String address, String type, int maxNumberOfCustomers, String menuName) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.menu = new Menu(menuName);
        this.tablesRestaurant = new HashMap<>();
        this.cashRegister = 0.0;
        this.maxNumberOfCustomers = maxNumberOfCustomers;
        this.numberOfCurrentCustomers = 0;
    }

    // GETTER & SETTE
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Menu getMenu() {return menu;}
    public String getAddress() {return this.address;}

    public void setAddress(String address) {this.address = address;}
    public String getType() {return this.type;}

    public void setType(String type) {this.type = type;}
    public Map<Table, Customer> getTablesRestaurant() {return this.tablesRestaurant;}

    public void setMenu(Menu menu) {this.menu = menu;}
    public void setTablesRestaurant(HashMap<Table, Customer> tablesRestaurant) {this.tablesRestaurant = tablesRestaurant;}

    public int getMaxNumberOfCustomers() {return this.maxNumberOfCustomers;}

    public double getCashRegister() {return cashRegister;}
    public void setCashRegister(double cashRegister) {this.cashRegister = cashRegister;}

    public void setMaxNumberOfCustomers(Integer maxNumberOfCustomers) {
        this.maxNumberOfCustomers = maxNumberOfCustomers;
    }

    public Integer getNumberOfCurrentCustomers() {return numberOfCurrentCustomers;}
    public void setNumberOfCurrentCustomers(Integer numberOfCurrentCustomers) {this.numberOfCurrentCustomers = numberOfCurrentCustomers;}

    // METHODS
    public void addCourseToMenu(Course course) {menu.addCourse(course);}
    public void addAllCourseToMenu(List<Course> courses) {menu.addAllCourse(courses);}

    /**
     *
     * @param customer
     * @param numeroPersone
     * @param tableId
     * @param order
     */
    public void bookTable(Customer customer, Integer numeroPersone, Integer tableId, Order order) {
    Table bookedTable = null;
    if(getNumberOfCurrentCustomers() + numeroPersone > maxNumberOfCustomers){
        System.out.println("Ne siete troppi");
    }else{
        setNumberOfCurrentCustomers(getNumberOfCurrentCustomers() + numeroPersone);
        bookedTable = new Table(tableId, numeroPersone, customer, order);
        bookedTable.bookTable(customer);
        tablesRestaurant.put(bookedTable, customer);
    }
}

    /**
     *
     */
    public void printOccupiedTables(){
        System.out.println("\nOCCUPIED TABLES:\n");
        for (Map.Entry<Table,Customer> table : tablesRestaurant.entrySet()) {
            if (table.getKey().getTableState() == TableStateEnum.OCCUPIED) {
                table.getKey().printInfo();
//                table.getValue().getOrderedCourses().forEach(c -> c.printInfo());
                System.out.println();
            }
        }
    }

    /**
     *
     * @param idTables
     */
    public void printInfoOrderTable(int idTables){
        double calculateBillTable = 0;
        System.out.println(TextModifierEnum.ANSI_YELLOW + "Ordered Courses: [" + TextModifierEnum.ANSI_RESET);
        for (Map.Entry<Table,Customer> entry:tablesRestaurant.entrySet()){
            if(entry.getKey().getId() == idTables){
                for (Course orderedCourse : entry.getKey().getOrder().getOrderedCoursesList()) {
                    calculateBillTable += orderedCourse.getPrice();
                    System.out.println(TextModifierEnum.ANSI_GREEN + "\t-" + orderedCourse.getName() + "= " + orderedCourse.getPrice() + "€" + TextModifierEnum.ANSI_RESET);
                }
            }
        }
        System.out.println(TextModifierEnum.ANSI_YELLOW + "]" + TextModifierEnum.ANSI_RESET);
                    System.out.println("\n\tBill to pay: " + Math.floor(calculateBillTable) + "€");
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
     * method that generate a type of menu with plus courses
     * you can choose the course
     */
    public List<Course> chooseCourseMenuType(MenuTypeEnum menuType) {
        List<Course> listToReturn = new ArrayList<>();
        for (Course course : menu.getCourseList()) {
            if (course.getMenuType().equals(menuType) || course.getMenuType().equals(MenuTypeEnum.BEVERAGE_MENU)) {
                listToReturn.add(course);
            }
        }
        listToReturn.sort(Comparator.comparingInt(a -> a.getCourseType().getId()));
        listToReturn.forEach(c -> {
            System.out.print(TextModifierEnum.ANSI_GREEN + c.getClass().getSimpleName() + ": " + TextModifierEnum.ANSI_RESET);
            c.printInfo();
            System.out.println();
        });
        return listToReturn;
    }

    /**
     * that method can print of menu with only one course of each type
     */
    public List<Course> generateAMenuType(MenuTypeEnum menuTypeEnum) {
        return menu.generateMenuOfTheDay(menuTypeEnum);
    }

    /**
     * Adds a course to the order of the customer
     * only if the customer sit in the table, and it's a course of the menu type he chose
     */
    public void addCourseToCustomer(Course course, Customer customer,Order order) {
        if (tablesRestaurant.containsValue(customer) && (course.getMenuType() == customer.getMenuType() || course.getMenuType().equals(MenuTypeEnum.BEVERAGE_MENU))) {
            order.addCourseToOrder(course);
        } else {
            System.out.println("Can't add course to the customer");
        }
    }

    /**
     * Remove a table
     *
     * @param table
     */
    public void removeTable(Table table) {
        if (tablesRestaurant.containsKey(table)) {
            tablesRestaurant.remove(table);
        } else {
            System.out.println(TextModifierEnum.ANSI_RED + "table not found");
        }
    }


    /**
     * Pays the check for the passed customer                                                                                                                                                                                                                             \
     *
     * @param table table to check
     */
    public void tableCheck(Table table, Order order, double discount) {
        List<Course> coursesCustomer = order.getOrderedCoursesList();
        double billToPay = order.calculateBill(discount);
        cashRegister += billToPay;
        System.out.println("Bill table n°" + table.getTableNumber() + " = " + billToPay + "€");
        if (discount > 0) {
            System.out.println("Applied discount " + discount + "%");
        }
    }

    /**
     * Print all table available
     */
    public void printAvailableTables() {
        System.out.println("\nAVAILABLE TABLES:\n");
        for (Table table : tablesRestaurant.keySet()) {
            if (table.getTableState() == TableStateEnum.AVAILABLE) {
                table.printInfo();
                System.out.println();
            }
        }
    }

    /**
     * Prints the list of all the occupied tables
     */

    /**
     * Prints the info's of all the tables
     */
    public void printTablesInfo() {
        for (Map.Entry<Table, Customer> table : tablesRestaurant.entrySet()) {
            if (table.getKey().getTableState().equals(TableStateEnum.OCCUPIED)) {
                String orderedCourses = table.getKey().getOrder().OrderedCourseToString();
                System.out.println(table.getValue().getName() + " table n° " + table.getKey().getId() + "\n" + orderedCourses);
            } else {
                table.getKey().printInfo();
                System.out.println();
            }
        }
    }
}
