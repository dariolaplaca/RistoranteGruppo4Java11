package database.dao;

import database.DBConnector;
import enumProject.AllergensEnum;
import restaurant.Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantDAO {
    public void insertRestaurant(Restaurant restaurant) throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlRestaurantValues = "INSERT INTO RESTAURANT(NAME, ADDRESS, TYPE, CASH_REGISTER, MAX_NUMBER_OF_CUSTOMERS, MENU_NAME) VALUES(?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlRestaurantValues);
        preparedStatement.setString(1,restaurant.getName());
        preparedStatement.setString(2,restaurant.getAddress());
        preparedStatement.setString(3,restaurant.getType());
        preparedStatement.setDouble(4,restaurant.getCashRegister());
        preparedStatement.setInt(5,restaurant.getMaxNumberOfCustomers());
        preparedStatement.setString(6,restaurant.getMenu().getName());

        preparedStatement.executeUpdate();
        connection.close();
    }

    public Restaurant getRestaurantByName(String name) throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "SELECT NAME FROM RESTAURANT WHERE NAME = ?";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setString(1, name);
        ResultSet result =  statement.executeQuery();
        Restaurant restaurantToReturn = null;
        while (result.next()){
            Integer id = result.getInt("id");
            String address = result.getString("address");
            String type = result.getString("type");
            Double cashRegister = result.getDouble("cash_register");
            Integer maxNumberOfCustomer = result.getInt("max_number_of_customers");
            String menuName = result.getString("menu_name");
            restaurantToReturn = new Restaurant(id, name, address, type, maxNumberOfCustomer, cashRegister, menuName);
        }
        result.close();
        connection.close();
        return restaurantToReturn;
    }

    public Restaurant getRestaurantById(Integer id) throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "SELECT NAME FROM RESTAURANT WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setInt(1, id);
        ResultSet result =  statement.executeQuery();
        Restaurant restaurantToReturn = null;
        while (result.next()){
            String name = result.getString("name");
            String address = result.getString("address");
            String type = result.getString("type");
            Double cashRegister = result.getDouble("cash_register");
            Integer maxNumberOfCustomer = result.getInt("max_number_of_customers");
            String menuName = result.getString("menu_name");
            restaurantToReturn = new Restaurant(id, name, address, type, maxNumberOfCustomer, cashRegister, menuName);
        }
        result.close();
        connection.close();
        return restaurantToReturn;
    }
}
