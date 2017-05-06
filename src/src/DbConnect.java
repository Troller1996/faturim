/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
Statement s=null;
    try {
        String url="jdbc:mysql://localhost:3306/dtb";
        Properties prop=new Properties();
        prop.setProperty("user","root");
        prop.setProperty("password","");
      
     
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        Properties props = null;
        conn = DriverManager.getConnection(url,prop);
       return conn;
    } catch (SQLException ex) {if(ex.toString().equals("com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Unknown database 'dtb'")){
       
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
            s = conn.createStatement();
            int Result = s.executeUpdate("CREATE DATABASE dtb");
        } catch (SQLException ex1) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
       else Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        
    return conn;
        
}}
  
}