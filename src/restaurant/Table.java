package restaurant;

import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;

/**
 * Table class represents the tables in the restaurant
 */
public class Table {

    private Integer id;
    private Customer customer;
    private TableStateEnum tableState;
    private Integer tableNumber;
    private Integer NumberOfOccupiedSeats;
    private Order order;

    /**
     * This is the constructor for the Table class
     */
    public Table(Integer id, Integer numberOfSeats,Customer customer, Order order) {
        this.id = id;
        this.tableState = TableStateEnum.AVAILABLE;
        this.NumberOfOccupiedSeats = numberOfSeats;
        this.customer = customer;
        this.order = order;
    }

    // GETTER & SETTER
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getTableNumber() {
        return this.tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public TableStateEnum getTableState() {
        return this.tableState;
    }

    public void setTableState(TableStateEnum tableState) {
        this.tableState = tableState;
    }

    public int getNumberOfOccupiedSeats() {
        return this.NumberOfOccupiedSeats;
    }

    public void setNumberOfOccupiedSeats(int numberOfOccupiedSeats) {
        this.NumberOfOccupiedSeats = numberOfOccupiedSeats;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void bookTable(Customer c){
        setTableState(TableStateEnum.OCCUPIED);
        setCustomer(c);
        System.out.println(TextModifierEnum.ANSI_GREEN + "Table book with success!!\n" + TextModifierEnum.ANSI_RESET +
                "Info Table: [ \n\tNumber Table: " + this.id + "\n\tName: " + c.getName() + "\n]");
    }

    /**
     * This is the printInfo method for the table that prints the number, state and number of seats of the table
     */
    public void printInfo() {
        System.out.println(TextModifierEnum.ANSI_RED + "Table n° " + this.id + "\n" + "Table state: " + tableState.getState() + TextModifierEnum.ANSI_RESET);
    }

//    public void printInfoTables(int idTables){
//        if(getId() == idTables && getTableState().equals(TableStateEnum.OCCUPIED)){
//            order.printInfoOrder();
//        }
//    }
}
