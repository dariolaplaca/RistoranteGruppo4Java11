package database.DAO;

import database.DBConnector;
import restaurant.Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
