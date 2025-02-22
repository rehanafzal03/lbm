/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adil
 */
public class connect {
    public static Connection Connection(){
        Connection con=null;
        try {
            String url = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC"; // Replace with your details
            con=DriverManager.getConnection(url, "root", "87654321");
            if (con != null) {
                System.out.println("Connection Established!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed! Please check the database details.");
        }
        return con;
    }
    
}
