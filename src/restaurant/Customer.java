package restaurant;

import course.Course;
import enumProject.MenuTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer class is the class that represents a customer of the restaurant.
 */
public class Customer {
    private Integer id;
    private String name;
    private MenuTypeEnum menuTypeEnum;

    public Customer(Integer id, String name, MenuTypeEnum menuTypeEnum) {
        this.id = id;
        this.name = name;
        this.menuTypeEnum = menuTypeEnum;
    }

    // GETTER & SETTE
    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public MenuTypeEnum getMenuType() {return this.menuTypeEnum;}
    public void setMenuType(MenuTypeEnum menuTypeEnum) {this.menuTypeEnum = menuTypeEnum;}

    /**
     * that method print the info of customer
     */
    public void printInfo() {
        System.out.println(this.name + " " + this.menuTypeEnum + " menu");
    }
}
