package restaurant;

import course.Course;
import enumProject.MenuTypeEnum;

import java.util.ArrayList;
import java.util.List;
//TODO AGGIUNGERE JAVADOC PER LA CLASSE
/**
 *
 */
public class Customer {
    private static int idCounter = 0;
    private int id;
    private String name;
    private MenuTypeEnum menuTypeEnum;
    private String mail;
    private String password;
    List<Course> orderedCourses;
    //TODO aggiungere una List<Course> aggiungere un metodo addCourse per aggiungere le portate scelte dal cliente
    //TODO double bill

    public Customer(String name, MenuTypeEnum menuTypeEnum, String mail, String password) {
        this.id = ++idCounter;
        this.name = name;
        this.menuTypeEnum = menuTypeEnum;
        this.mail = mail;
        this.password = password;
        orderedCourses = new ArrayList<>();
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

    public List<Course> getOrderedCourses(){
        return this.orderedCourses;
    }

    /**
     * Adds a course to the ordered course of a customer
     * @param c is the course to add
     */
    public void addOrderedCourse(Course c){
        orderedCourses.add(c);
    }
    //TODO aggiungere una funzione che calcola il conto e ritorna un double del conto da pagare

    /**
     * that method print the info of customer
     */
    public void printInfo(){System.out.println(this.name + " " + this.menuTypeEnum + " menu\n" + this.mail);}
}
