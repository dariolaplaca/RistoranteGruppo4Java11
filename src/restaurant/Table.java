package restaurant;

import enumProject.TableStateEnum;
import enumProject.TextModifierEnum;

/**
 * Table class represents the tables in the restaurant
 */
public class Table {

    private static int idCounter = 0;
    private int id;
    private TableStateEnum tableState;
    private int NumberOfOccupiedSeats;

    /***
     * This is the constructor for the Table class
     */
    public Table(int numberOfSeats) {
        this.id = ++idCounter;
        this.tableState = TableStateEnum.AVAILABLE;
        this.NumberOfOccupiedSeats = numberOfSeats;
    }

    // GETTER & SETTER
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    /**
     * This is the printInfo method for the table that prints the number, state and number of seats of the table
     */
    public void printInfo() {
        System.out.println(TextModifierEnum.ANSI_RED + "Table n° " + this.id + "\n" + "Table state: " + tableState.getState() + TextModifierEnum.ANSI_RESET);
    }
}
