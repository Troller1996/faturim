/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DbConnect {

public static Connection Connect()
{Connection conn = null;
    try {
        String url="jdbc:mysql://192.168.1.9:3306/dtb";
        Properties prop=new Properties();
        prop.setProperty("user","user");
        prop.setProperty("password","user");
      
     
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        Properties props = null;
        conn = DriverManager.getConnection(url,prop);
       return conn;
    } catch (SQLException ex) {
        Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
    return conn;
        
}}
  
}