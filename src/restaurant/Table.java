package restaurant;

import enumProject.MenuTypeEnum;
import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;

/**
 * Table class represents the tables in the restaurant
 */
public class Table {

    private static int idCounter = 0;
    private int id;
    //TODO Rimuovere Customer e MenuType in tutto table
    private Customer customer;
    private MenuTypeEnum menuTypeEnum;
    private int numberOfSeats;
    private TableStateEnum tableState;

    /***
     * This is the constructor for the Table class
     * @param numberOfSeats The number of seats of the table
     */
    public Table(int numberOfSeats) {
        this.id = ++idCounter;
        this.numberOfSeats = numberOfSeats;
        this.customer = null;
        this.menuTypeEnum = null;
        this.tableState = TableStateEnum.AVAILABLE;
    }
// GETTER & SETTER
    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public MenuTypeEnum getMenuType() {return this.menuTypeEnum;}
    public void setMenuType(MenuTypeEnum menuTypeEnum) {this.menuTypeEnum = menuTypeEnum;}

    public int getNumberOfSeats() {return this.numberOfSeats;}
    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

    public Customer getCustomer() {return this.customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}

    public TableStateEnum getTableState() {
        return this.tableState;
    }
    public void setTableState(TableStateEnum tableState) {
        this.tableState = tableState;
    }

    /***
     * This bookTable method allows the customer to book a table
     * @param customer  The customer that book the table
     */
    public void bookTable(Customer customer){
        setCustomer(customer);
        setTableState(TableStateEnum.OCCUPIED);
        setMenuType(customer.getMenuType());
    }
    /**
     * This freeTable method set null the customer and the menu and brings back the table available
     */
    public void freeTable(){
        setCustomer(null);
        setMenuType(null);
        setTableState(TableStateEnum.AVAILABLE);
    }
    /**
     * This is the printInfo method for the table that prints the number, state and number of seats of the table
     */
    public void printInfo(){
        if(this.customer == null){
            System.out.println(TextModifierEnum.ANSI_GREEN + "Table n° " + this.id + "\n" + "Table state: Empty\nNumber of seats: " + this.numberOfSeats + TextModifierEnum.ANSI_RESET);
        } else {
            System.out.println(TextModifierEnum.ANSI_RED + "Table n° " + this.id + "\n" + "Table state: " + tableState + "\nNumber of seats: " + this.numberOfSeats + TextModifierEnum.ANSI_RESET);
        }
    }
}
