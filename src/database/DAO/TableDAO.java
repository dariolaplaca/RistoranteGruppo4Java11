package database.DAO;

import database.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableDAO {
    public void insertIntoTable() throws SQLException {
        Connection connection = DBConnector.getConnection();
        String sqlInsertValues = "INSERT INTO RESTAURANT_TABLE() VALUES();";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertValues);
    }

}
