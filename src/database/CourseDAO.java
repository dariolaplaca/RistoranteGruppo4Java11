package database;

import course.Course;
import course.Firsts;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseDAO {

    public void insertCourse(Course course) throws SQLException {
        Connection connection = DBConnector.getConnection();
        Statement statement = connection.createStatement();
        String sqlCommand = "INSERT INTO " + course.getCourseType().getName() + "";

        statement.executeQuery(sqlCommand);
        connection.close();
    }
}
