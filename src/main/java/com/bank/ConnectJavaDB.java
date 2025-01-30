/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Declares the package name for organizing related classes.
package com.bank;

// Imports required classes for database connection and user notifications.
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * This class handles the database connection logic for the application
 */
public class ConnectJavaDB {    
    
    // Database connection URL, username, and password are declared as static variables for reuse.
    static String URL = "jdbc:mysql://localhost:3306/bankswing"; // The JDBC URL for the MySQL database
    static String username = "root"; // Username for the database
    static String Password = "123456"; // Password for the database
    
      /**
     * Establishes a connection to the database.
     * 
     * @return Connection object if successful, or null if an exception occurs.
     */
    public static Connection connectDB()
    {
        try
        {       
            // Attempts to establish a connection to the database using the provided URL, username, and password.
            Connection conn = DriverManager.getConnection(URL,username,Password);
            
            // Returns the established connection
            return conn;
        }catch(Exception e)
        {
            // Displays an error message if the connection fails
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // Returns null if the connection fails
        return null;
    }
}

