package restaurant;

import enumRestaurant.MenuType;
import restaurant.Customer;

public class Table {
    private static int idCounter = 0;
    private int id;

    private Customer customer;
    private MenuType menuType;
    private int numberOfSeats;

    public Table(int numberOfSeats) {
        this.id = ++idCounter;
        this.numberOfSeats = numberOfSeats;
        this.customer = null;
        this.menuType = null;
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
        if(this.customer == null){
            System.out.println("Table n° " + this.id + "\n" + "Booked for: Nobody\nNumber of seats: " + this.numberOfSeats);
        } else {
            System.out.println("Table n° " + this.id + "\n" + "Booked for: " + this.customer.getName() + "\nNumber of seats: " + this.numberOfSeats);
        }

    }
}
