public class Table {
    private static int idCounter = 0;
    private int id;
    private Customer customer;
    private MenuType menuType;
    private int numberOfSeats;
    private boolean isVip;

    public Table(MenuType menuType, int numberOfSeats, boolean isVip) {
        this.id = ++idCounter;
        this.menuType = menuType;
        this.numberOfSeats = numberOfSeats;
        this.isVip = isVip;
        this.customer = null;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MenuType getMenuType() {
        return this.menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void bookTable(Customer customer){
        setCustomer(customer);
        setMenuType(customer.getMenuType());
    }

    public void freeTable(){
        setCustomer(null);
        setMenuType(null);
    }

    public void printInfo(){
        System.out.println("Table n° " + this.id + "\n" + "Booked for: " + this.customer.getName() + "\nNumber of seats: " + this.numberOfSeats);
    }
}
