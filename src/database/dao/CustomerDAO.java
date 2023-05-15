package database.dao;

import database.DBConnector;
import enumProject.AllergensEnum;
import enumProject.MenuTypeEnum;
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

    public Customer getCustomer(Integer id) throws SQLException {
        Connection connection = DBConnector.getConnection();
         Statement statement = connection.createStatement();
        String sqlQueryCustomer = "SELECT * FROM CUSTOMER WHERE id = " + id;
        ResultSet resultSet = statement.executeQuery(sqlQueryCustomer);

        Customer customer = null;
        while (resultSet.next()) {
            String name = resultSet.getString("NAME");
            String menuType = resultSet.getString("MENU_TYPE");
            MenuTypeEnum mtEnum = null;
            for (MenuTypeEnum menuTypeEnum : MenuTypeEnum.values()){
                if (menuType.equals(menuTypeEnum.getName())){
                    mtEnum = menuTypeEnum;
                }
            }
            customer = new Customer(id, name,mtEnum);
        }
        resultSet.close();
        connection.close();
        return customer;
    }
}
