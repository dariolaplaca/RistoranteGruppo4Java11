package database.DAO;

import database.DBConnector;
import restaurant.Customer;

import java.sql.*;

public class CustomerDAO {

    public void insertCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlInsertCustomer = "INSERT INTO CUSTOMER(NAME, MENU_TYPE) VALUES(?,?)";
        PreparedStatement preparedStatement  = connection.prepareStatement(sqlInsertCustomer);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getMenuType().getName());
        preparedStatement.executeUpdate();
        connection.close();
    }
}
