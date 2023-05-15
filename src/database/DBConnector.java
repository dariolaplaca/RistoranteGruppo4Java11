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
                MENU_TYPE VARCHAR(255)
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
                MAX_NUMBER_OF_CUSTOMERS INT,
                MENU_NAME VARCHAR(255) NOT NULL
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
                IS_GOURMET BOOLEAN NOT NULL
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

        String sqlCreateAllergenTable = """
                CREATE TABLE IF NOT EXISTS ALLERGEN(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL UNIQUE
                );
                """;
        schema.executeUpdate(sqlCreateAllergenTable);

        String sqlCreateMenuTable = """
                CREATE TABLE IF NOT EXISTS MENU(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(255) NOT NULL,
                RESTAURANT_ID INT,
                FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(ID)
                );
                """;
        schema.executeUpdate(sqlCreateMenuTable);

        String sqlCreateCourseTable = """
                CREATE TABLE IF NOT EXISTS COURSE(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                COURSE_TYPE VARCHAR(255) NOT NULL,
                MENU_ID INT NOT NULL,
                BEVERAGE_ID INT NOT NULL,
                STARTER_ID INT NOT NULL,
                FIRST_ID INT NOT NULL,
                SECOND_ID INT NOT NULL,
                DESSERT_ID INT NOT NULL,
                FOREIGN KEY (MENU_ID) REFERENCES MENU(ID),
                FOREIGN KEY (BEVERAGE_ID) REFERENCES BEVERAGE(ID),
                FOREIGN KEY (STARTER_ID) REFERENCES STARTER(ID),
                FOREIGN KEY (FIRST_ID) REFERENCES FIRST(ID),
                FOREIGN KEY (SECOND_ID) REFERENCES SECOND(ID),
                FOREIGN KEY (DESSERT_ID) REFERENCES DESSERT(ID)  
                );
                """;
        schema.executeUpdate(sqlCreateCourseTable);

        String sqlCreateTableCourseAllergensRelationship = """
                CREATE TABLE IF NOT EXISTS COURSE_ALLERGENS_RELATION(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                COURSE_ID INT NOT NULL,
                ALLERGEN_ID INT,
                FOREIGN KEY (COURSE_ID) REFERENCES COURSE(ID),
                FOREIGN KEY (ALLERGEN_ID) REFERENCES ALLERGEN(ID)
                );
                """;
        schema.executeUpdate(sqlCreateTableCourseAllergensRelationship);

        String sqlCreateOrderTable = """
                CREATE TABLE IF NOT EXISTS TABLE_ORDER(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                ORDERED_TIME DATE NOT NULL,
                RESTAURANT_ID INT NOT NULL,
                FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(ID)
                );
                """;
        schema.executeUpdate(sqlCreateOrderTable);

        String sqlCreateTableResTable = """
                CREATE TABLE IF NOT EXISTS RESTAURANT_TABLE(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                TABLE_NUMBER INT NOT NULL,
                CUSTOMER_ID INT NOT NULL,
                TABLE_ORDER_ID INT NOT NULL,
                FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID),
                FOREIGN KEY (TABLE_ORDER_ID) REFERENCES TABLE_ORDER(ID)
                );
                """;
        schema.executeUpdate(sqlCreateTableResTable);

        String sqlCreateTableOrderedCourse = """
                CREATE TABLE IF NOT EXISTS ORDERED_COURSE(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                TABLE_ORDER_ID INT NOT NULL,
                COURSE_ID INT NOT NULL,
                FOREIGN KEY (TABLE_ORDER_ID) REFERENCES TABLE_ORDER(ID),
                FOREIGN KEY (COURSE_ID) REFERENCES COURSE(ID)
                );
                """;
        schema.executeUpdate(sqlCreateTableOrderedCourse);

        connection.close();
    }
}
