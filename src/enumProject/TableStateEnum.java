package enumProject;

/**
 * This enum defines the state of the table
 */
public enum TableStateEnum {
    AVAILABLE("Free"),
    OCCUPIED("Booked");

    public final String state;

    TableStateEnum(String state) {
        this.state = state;
    }
    public String getState() {return state;}

}
