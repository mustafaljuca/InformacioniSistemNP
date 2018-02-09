/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacionisistem;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Mustafa
 */
public class DataBaseConnection {
    
    Connection conn = null ; 
    public static Connection java_db()
    {
        try // sve sto se nalazi u try se obavlja
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:\\C:\\Users\\Mustafa\\Documents\\NetBeansProjects\\InformacioniSistem\\mojabaza.sqlite");
            return conn;
        }
        
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog (null, e);
            return null;
        }
    }
    
}