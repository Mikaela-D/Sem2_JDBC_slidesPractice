package ie.atu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StandardTestConnection {

    public static void main(String[] args) {
        Connection connection = null;
        try
        {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
            System.out.println("Connection made to connection pool");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
