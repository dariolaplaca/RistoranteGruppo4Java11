package restaurant;

import enumProject.MenuTypeEnum;
import enumProject.TableStateEnum;
/**
 *
 */
public class Table {

    private static int idCounter = 0;
    private int id;
    private Customer customer;
    private MenuTypeEnum menuTypeEnum;
    private int numberOfSeats;
    private TableStateEnum tableState;

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

    /**
     *
     */
    public void bookTable(Customer customer){
        setCustomer(customer);
        setTableState(TableStateEnum.OCCUPIED);
        setMenuType(customer.getMenuType());
    }
    /**
     *
     */
    public void freeTable(){
        setCustomer(null);
        setMenuType(null);
        setTableState(TableStateEnum.AVAILABLE);
    }
    /**
     *
     */
    public void printInfo(){
        if(this.customer == null){
            System.out.println("Table n° " + this.id + "\n" + "Booked for: Empty\nNumber of seats: " + this.numberOfSeats);
        } else {
            System.out.println("Table n° " + this.id + "\n" + "Booked for: " + this.customer.getName() + "\nNumber of seats: " + this.numberOfSeats);
        }

    }
}
