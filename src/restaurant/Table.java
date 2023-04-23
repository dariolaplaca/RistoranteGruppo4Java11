package restaurant;
import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;

/**
 * Table class represents the tables in the restaurant
 */
public class Table {

    private static int idCounter = 0;
    private int id;
    private int numberOfSeats;
    private TableStateEnum tableState;

    /***
     * This is the constructor for the Table class
     * @param numberOfSeats The number of seats of the table
     */
    public Table(int numberOfSeats) {
        this.id = ++idCounter;
        this.numberOfSeats = numberOfSeats;
        this.tableState = TableStateEnum.AVAILABLE;
    }
// GETTER & SETTER
    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public int getNumberOfSeats() {return this.numberOfSeats;}
    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

    public TableStateEnum getTableState() {
        return this.tableState;
    }
    public void setTableState(TableStateEnum tableState) {
        this.tableState = tableState;
    }
    /**
     * This is the printInfo method for the table that prints the number, state and number of seats of the table
     */
    public void printInfo(){
            System.out.println(TextModifierEnum.ANSI_RED + "Table n° " + this.id + "\n" + "Table state: " + tableState + "\nNumber of seats: " + this.numberOfSeats + TextModifierEnum.ANSI_RESET);
    }
}
