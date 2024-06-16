/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author soham
 */
import java.sql.DriverManager;
import java.sql.Connection;

public class Connectionprovider 
{
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orphan","root","soham123");
            System.out.println("Successfully connected");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String ...args)
    {
        getCon();
    }
}


//jdbc:mysql://localhost:3306/orphan?zeroDateTimeBehavior=CONVERT_TO_NULL
