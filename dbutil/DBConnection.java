/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-HVE4ROK:1521/xe","onlineexam","student");
            JOptionPane.showMessageDialog(null," db connection sucessful");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null," Exception"+ex);
        }
    }
    public static Connection getConnection() //when we call getConnection, firstly call static  only one time
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            if(conn!=null)
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"connection is not close");
        }
    }
    
}
