package course;

import enumRestaurant.AllergensEnum;
import enumRestaurant.CourseEnum;
import enumRestaurant.MenuType;
import enumRestaurant.TextModifierEnum;

import java.util.*;

public abstract class Course {
    protected String name;
    protected String description;
    protected double price;
    protected Set<AllergensEnum> allergens;
    protected MenuType menuType;
    protected CourseEnum courseType;
    protected double calories;

    public Course(String name, String description, double calories, double price, MenuType menuType, Set<AllergensEnum> allergens) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
        this.menuType = menuType;
        this.allergens = new HashSet<>(allergens);
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}

    public MenuType getMenuType() {return menuType;}
    public void setMenuType(MenuType menuType) {this.menuType = menuType;}

    public Set<AllergensEnum> getAllergens() {return allergens;}
    public void setAllergens(HashSet<AllergensEnum> allergens) {this.allergens = allergens;}

    public void setCourseType(CourseEnum courseType) {this.courseType = courseType;}
    public CourseEnum getCourseType() {return this.courseType;}

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public double getCalories() {return calories;}
    public void setCalories(double calories) {this.calories = calories;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public void printInfo() {
        System.out.println("\t" +
                TextModifierEnum.ANSI_BOLD +
                TextModifierEnum.ANSI_RED + this.name +
                TextModifierEnum.ANSI_RESET + " - " + this.price + "€\n" +
                TextModifierEnum.ANSI_DESCRIPTION_COLOR_AND_BACKGROUND +
                TextModifierEnum.ANSI_ITALIC +
                getDescription() + TextModifierEnum.ANSI_RESET);
    }

    public void checkAllergens() {
        Set<AllergensEnum> allergens = this.getAllergens();
        if (allergens.contains(AllergensEnum.NONE)) {
            System.out.println(TextModifierEnum.ANSI_RED + getName() + TextModifierEnum.ANSI_RESET + " is safe to eat.");
        } else {
            System.out.print(TextModifierEnum.ANSI_BRIGHT_YELLOW + "Warning: " + TextModifierEnum.ANSI_RESET +
                    TextModifierEnum.ANSI_BRIGHT_RED + getName() +
                    TextModifierEnum.ANSI_RESET + " contains ");
            for (AllergensEnum allergen : allergens) {
                System.out.print("[" + allergen.getName() + "] ");
            }
        }
        System.out.println();
    }
}
