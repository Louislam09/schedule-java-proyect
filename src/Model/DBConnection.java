/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author louis
 */
public class DBConnection {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public Connection getConnection(){
//        String url="jdbc:mysql://localhost:3306/schedule?zeroDateTimeBehavior=convertToNull";
        String url="jdbc:mysql://localhost:3306/schedule";

        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Not Connected");
        }
        return con;
    }
}
