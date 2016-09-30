package Connections;

import java.sql.*;

import static java.lang.Class.forName;

/**
 * Created by NinoPkhakadze on 9/30/2016.
 */
public class DatabaseConn {
    public static void main(String[] args) {
        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mygame","root","");
            ResultSet resultSet = connection.createStatement().executeQuery("select COUNT(1) as size from words");

            if ( resultSet.next() ){
                System.out.println(resultSet.getInt("size"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
