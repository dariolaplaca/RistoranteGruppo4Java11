package database.DAO;

import course.*;
import database.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseDAO {

    public void insertCourse(Course course) throws SQLException {
        Connection connection = DBConnector.getConnection();
        if(course.getCourseType().getName().equals("Starter")){
            String sqlCommand = "INSERT INTO STARTER(NAME, DESCRIPTION, CALORIES, PRICE, COURSE_TYPE, MENU_TYPE, IS_GOURMET) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setDouble(3, course.getCalories());
            preparedStatement.setDouble(4, course.getPrice());
            preparedStatement.setString(5, course.getCourseType().getName());
            preparedStatement.setString(6, course.getMenuType().getName());
            preparedStatement.setBoolean(7, ((Starters) course).isGourmet());
            preparedStatement.executeUpdate();
        }
        if(course.getCourseType().getName().equals("First")){
            String sqlCommand = "INSERT INTO FIRST(NAME, DESCRIPTION, CALORIES, PRICE, COURSE_TYPE, MENU_TYPE, WEIGHT, IS_COLD) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setDouble(3, course.getCalories());
            preparedStatement.setDouble(4, course.getPrice());
            preparedStatement.setString(5, course.getCourseType().getName());
            preparedStatement.setString(6, course.getMenuType().getName());
            preparedStatement.setDouble(7, ((Firsts) course).getWeight());
            preparedStatement.setBoolean(8, ((Firsts) course).isAColdCourse());
            preparedStatement.executeUpdate();
        }
        if(course.getCourseType().getName().equals("Second")){
            String sqlCommand = "INSERT INTO SECOND(NAME, DESCRIPTION, CALORIES, PRICE, COURSE_TYPE, MENU_TYPE, WEIGHT, COUNTOUR, HIGH_PROTEIN) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setDouble(3, course.getCalories());
            preparedStatement.setDouble(4, course.getPrice());
            preparedStatement.setString(5, course.getCourseType().getName());
            preparedStatement.setString(6, course.getMenuType().getName());
            preparedStatement.setDouble(7, ((Seconds) course).getWeight());
            preparedStatement.setBoolean(8, ((Seconds) course).isContour());
            preparedStatement.setBoolean(9, ((Seconds) course).isHighProtein());
            preparedStatement.executeUpdate();
        }
        if(course.getCourseType().getName().equals("Dessert")){
            String sqlCommand = "INSERT INTO DESSERT(NAME, DESCRIPTION, CALORIES, PRICE, COURSE_TYPE, MENU_TYPE, WEIGHT) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setDouble(3, course.getCalories());
            preparedStatement.setDouble(4, course.getPrice());
            preparedStatement.setString(5, course.getCourseType().getName());
            preparedStatement.setString(6, course.getMenuType().getName());
            preparedStatement.setDouble(7, ((Desserts) course).getWeight());
            preparedStatement.executeUpdate();
        }
        if(course.getCourseType().getName().equals("Beverage")){
            String sqlCommand = "INSERT INTO BEVERAGE(NAME, DESCRIPTION, CALORIES, PRICE, COURSE_TYPE, MENU_TYPE, MILLILITERS, IS_ALCOHOLIC) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setDouble(3, course.getCalories());
            preparedStatement.setDouble(4, course.getPrice());
            preparedStatement.setString(5, course.getCourseType().getName());
            preparedStatement.setString(6, course.getMenuType().getName());
            preparedStatement.setDouble(7, ((Beverages) course).getMilliliters());
            preparedStatement.setBoolean(8, ((Beverages) course).isAlcoholic());
            preparedStatement.executeUpdate();
        }

        connection.close();
    }
}
