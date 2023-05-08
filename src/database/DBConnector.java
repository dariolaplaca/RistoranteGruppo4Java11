package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DatabaseCredentials.getDbUrl(), DatabaseCredentials.getUSER(), DatabaseCredentials.getPASS());
    }



    public static void buildSchema() throws SQLException {
        Connection connection = getConnection();
        Statement schema = connection.createStatement();
        schema.executeUpdate("""
                CREATE TABLE IF NOT EXISTS CUSTOMER(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255),
                MAIL VARCHAR(255) UNIQUE NOT NULL,
                PASSWORD VARCHAR(255) NOT NULL
                );
                """);

        schema.executeUpdate("""
                CREATE TABLE IF NOT EXISTS RESTAURANT(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL,
                ADDRESS VARCHAR(255) NOT NULL,
                TYPE VARCHAR(255) NOT NULL,
                CASH_REGISTER DOUBLE,
                MAX_NUMBER_OF_CUSTOMERS INT
                );
                """);
//ATTEMPTING TO ADD TABLE: TABLE TO THE DB. SORRY SE FA SCHIFO
        schema.executeUpdate("""
                CREATE TABLE IF NOT EXISTS TABLE(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                RESTAURANT_ID INT NOT NULL,
                FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(ID)
                );
                """);

        connection.close();
    }
}
