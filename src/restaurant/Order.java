package restaurant;

import course.Course;
import menu.Menu;

import java.util.List;

public class Order {
    private int id;
    private List<Course> orderList;
    private Table table;
    private Menu menu;
    private Customer customer;

    public Order(Customer customer,Menu menu){
        this.customer = customer;
        this.menu = menu;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public List<Course> getOrderList() {return orderList;}
    public void setOrderList(List<Course> orderList) {this.orderList = orderList;}

    public Table getTable() {return table;}
    public void setTable(Table table) {this.table = table;}

    public Menu getMenu() {return menu;}
    public void setMenu(Menu menu) {this.menu = menu;}

    public Customer getCustomer() {return customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}

    public void addListOrder(List<Course>c){
        customer.setOrderedCourses(c);
    }
}
