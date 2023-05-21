package database.dao;

import database.DBConnector;
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

    public AllergensEnum getAllergenByName(String name) throws SQLException{
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "SELECT NAME FROM ALLERGEN WHERE NAME = ?";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setString(1, name);
        ResultSet result =  statement.executeQuery();
        result.next();
        String allergenName = result.getString("name");
        AllergensEnum allergenToReturn = AllergensEnum.getAllergenByName(allergenName);
        result.close();
        connection.close();
        return allergenToReturn;
    }

    public AllergensEnum getAllergenById(Integer id) throws SQLException{
        Connection connection = DBConnector.getConnection();
        String sqlCommand = "SELECT NAME FROM ALLERGEN WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(sqlCommand);
        statement.setInt(1, id);
        ResultSet result =  statement.executeQuery();
        result.next();
        int allergenId = result.getInt("id");
        AllergensEnum allergenToReturn = AllergensEnum.getAllergenById(allergenId);
        result.close();
        connection.close();
        return allergenToReturn;
    }

}
