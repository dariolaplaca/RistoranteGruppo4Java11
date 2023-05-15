package database.DAO;

import database.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableDAO {
    public void insertIntoTable(Integer tableNumber, Integer customerId, Integer orderId, Integer numberOfSeats) throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlInsertValues = "INSERT INTO RESTAURANT_TABLE(TABLE_NUMBER, CUSTOMER_ID, TABLE_ORDER_ID, NUMBER_OF_SEATS) VALUES(?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertValues);
        preparedStatement.setInt(1, tableNumber);
        preparedStatement.setInt(2, customerId);
        preparedStatement.setInt(3, orderId);
        preparedStatement.setInt(4, numberOfSeats);
        preparedStatement.executeUpdate();
        connection.close();

    }

}
