/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.*;

/**
 *
 * @author HP
 */
public class Connect {
    public static Connection connect() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_car_rent", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error : " + e);
        }
        
        return conn;
    }
}
