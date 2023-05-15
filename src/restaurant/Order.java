package restaurant;

import course.Course;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Course> orderedCoursesList;
    private Timestamp orderedTime;
    private Double billToPay;
    private Restaurant restaurant;



    public Order(Restaurant restaurant, Timestamp orderedTime){
        this.restaurant = restaurant;
        this.orderedTime = orderedTime;
        this.orderedCoursesList = new ArrayList<>();
        billToPay = 0d;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Course> getOrderedCoursesList() {
        return this.orderedCoursesList;
    }

    public Timestamp getOrderedTime() {
        return this.orderedTime;
    }

    public void setOrderedTime(Timestamp orderedTime) {
        this.orderedTime = orderedTime;
    }

    public Double getBillToPay() {
        return this.billToPay;
    }

    public void setBillToPay(Double billToPay) {
        this.billToPay = billToPay;
    }

    /**
     * Add a list of courses in our ordered courses list
     * @param c
     */
    public void addListToOrder(List<Course>c){
        this.orderedCoursesList.addAll(c);
    }

    /**
     * Adds a course to the ordered course of a customer
     *
     */

    public void addCourseToOrder(Course c){
        this.orderedCoursesList.add(c);
    }

    /**
     * That method apply a discount
     *
     * @param discount
     * @return
     */
    public double calculateBill(double discount) {
        for (Course course : orderedCoursesList) {
            billToPay += course.getPrice();
        }
        return Math.floor((billToPay / 100) * (100 - discount));
    }

    /**
     * It's a method to retrieve all the ordered courses names
     *
     * @return all the names of the ordered courses as a String
     */
    public String OrderedCourseToString() {
        StringBuilder sb = new StringBuilder();
        for (Course c : orderedCoursesList) {
            sb.append(c.getName()).append(" - ");
        }
        return sb.substring(0, sb.toString().length() - 3);
    }


//    public void courseRev(Course c){
//        List<Course> coursesList = customer.getOrderedCourses();
//        for (Course course : coursesList) {
//            if(course.getName().equals(c.getName())){
//                coursesList.remove(c);
//            }
//                customer.setOrderedCourses(coursesList);
//        }
//    }
}
