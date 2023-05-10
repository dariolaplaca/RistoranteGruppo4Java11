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

        String sqlCreateTableCustomer = """
                CREATE TABLE IF NOT EXISTS CUSTOMER(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255),
                MAIL VARCHAR(255) UNIQUE NOT NULL,
                PASSWORD VARCHAR(255) NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableCustomer);

        String sqlCreateTableRestaurant = """
                CREATE TABLE IF NOT EXISTS RESTAURANT(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL,
                ADDRESS VARCHAR(255) NOT NULL,
                TYPE VARCHAR(255) NOT NULL,
                CASH_REGISTER DOUBLE,
                MAX_NUMBER_OF_CUSTOMERS INT
                );
                """;
        schema.executeUpdate(sqlCreateTableRestaurant);

        String sqlCreateTableStarter = """
                CREATE TABLE IF NOT EXISTS STARTER(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE,
                DESCRIPTION VARCHAR(255) NOT NULL,
                CALORIES DOUBLE NOT NULL,
                PRICE DOUBLE NOT NULL,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255) NOT NULL,
                IS_GORUMET BOOLEAN NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableStarter);

        String sqlCreateTableFirst = """
                CREATE TABLE IF NOT EXISTS FIRST(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE,
                DESCRIPTION VARCHAR(255) NOT NULL,
                CALORIES DOUBLE NOT NULL,
                PRICE DOUBLE NOT NULL,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255) NOT NULL,
                WEIGHT DOUBLE NOT NULL,
                IS_COLD BOOLEAN NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableFirst);

        String sqlCreateTableSecond = """
                CREATE TABLE IF NOT EXISTS SECOND(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE,
                DESCRIPTION VARCHAR(255) NOT NULL,
                CALORIES DOUBLE NOT NULL,
                PRICE DOUBLE NOT NULL,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255) NOT NULL,
                WEIGHT DOUBLE NOT NULL,
                CONTOUR BOOLEAN NOT NULL,
                HIGH_PROTEIN BOOLEAN NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableSecond);

        String sqlCreateTableDessert = """
                CREATE TABLE IF NOT EXISTS DESSERT(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE,
                DESCRIPTION VARCHAR(255) NOT NULL,
                CALORIES DOUBLE NOT NULL,
                PRICE DOUBLE NOT NULL,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255) NOT NULL,
                WEIGHT DOUBLE NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableDessert);

        String sqlCreateTableBeverage = """
                CREATE TABLE IF NOT EXISTS BEVERAGE(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE,
                DESCRIPTION VARCHAR(255) NOT NULL,
                CALORIES DOUBLE NOT NULL,
                PRICE DOUBLE NOT NULL,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_TYPE VARCHAR(255) NOT NULL,
                MILLILITERS DOUBLE NOT NULL,
                IS_ALCOHOLIC BOOLEAN NOT NULL
                );
                """;
        schema.executeUpdate(sqlCreateTableBeverage);

        connection.close();
    }
}
