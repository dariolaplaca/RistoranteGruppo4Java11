package restaurant;

import course.Course;
import enumProject.MenuTypeEnum;
import enumProject.TextModifierEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Customer class is the class that represents a customer of the restaurant.
 */
public class Customer {
    private static int idCounter = 0;
    private int id;
    private String name;
    private MenuTypeEnum menuTypeEnum;
    private String mail;
    private String password;
    private List<Course> orderedCourses;
    private double billToPay;

    public Customer(String name, MenuTypeEnum menuTypeEnum, String mail, String password) {
        this.id = ++idCounter;
        this.name = name;
        this.menuTypeEnum = menuTypeEnum;
        this.mail = mail;
        this.password = password;
        orderedCourses = new ArrayList<>();
        this.billToPay = 0 ;
    }
// GETTER & SETTER
    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public MenuTypeEnum getMenuType() {return this.menuTypeEnum;}
    public void setMenuType(MenuTypeEnum menuTypeEnum) {this.menuTypeEnum = menuTypeEnum;}

    public String getMail() {return this.mail;}
    public void setMail(String mail) {this.mail = mail;}

    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password = password;}

    public List<Course> getOrderedCourses(){return this.orderedCourses;}

    /**
     * Adds a course to the ordered course of a customer
     * @param c is the course to add
     */
    public void addOrderedCourse(Course c){orderedCourses.add(c);}
    public void addAllOrderedCourse(List<Course> c){orderedCourses.addAll(c);}

public double calculateBill(List<Course>orderedCourses) {
    for (Course course : orderedCourses) {
        billToPay += course.getPrice();
    }
    return Math.floor(billToPay);
}

    /**
     * That method apply a discount
     * @param discount
     * @return
     */
    public double calculateBill(List<Course>orderedCourses, double discount) {
    for (Course course : orderedCourses) {
        billToPay += course.getPrice();
    }
    return Math.floor((billToPay / 100) * (100 - discount))  ;
}
    /**
     * that method print the info of customer
     */
    public void printInfo(){System.out.println(this.name + " " + this.menuTypeEnum + " menu\n" + this.mail);}
}
