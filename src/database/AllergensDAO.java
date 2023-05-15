package database;

import com.mysql.cj.protocol.Resultset;
import enumProject.AllergensEnum;

import java.sql.*;

public class AllergensDAO {

    public void insertAllergen(AllergensEnum allergen) throws SQLException{
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "INSERT INTO ALLERGEN(NAME) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setString(1, allergen.getName());
        statement.executeUpdate();
        connection.close();
    }

    public AllergensEnum getAllergen(String name) throws SQLException{
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "SELECT NAME FROM ALLERGEN WHERE NAME = ?";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setString(1, name);
        ResultSet result =  statement.executeQuery();
        result.next();
        String allergenName = result.getString("name");
        AllergensEnum allergenToReturn = null;
        for (AllergensEnum allergensEnum : AllergensEnum.values()){
            if (allergenName.equals(allergensEnum.getName())){
                allergenToReturn = allergensEnum;
            }
        }
        result.close();
        connection.close();
        return allergenToReturn;
    }
}
