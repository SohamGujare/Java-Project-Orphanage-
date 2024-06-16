/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author soham
 */
/**
 *
 * @author soham
 */
public class tables
{
    public static void main(String[] args)
    {
        Connection  con = Connectionprovider.getCon();
        Statement st = null;
        try
        {
              st =con.createStatement();
              st.executeUpdate("create table orphanmanager(name varchar(200),number varchar(11),email varchar(100),password varchar(50),orphanage varchar(200),country varchar(50),state varchar(50),pincode varchar(10),city varchar(100),landmark varchar(200),licence varchar(200))");
              st.executeUpdate("create table family(fam_name varchar(200),fam_number varchar(11),fam_email varchar(100),fam_password varchar(100),fam_nationality varchar(100),fam_aadhar varchar(25),fam_member varchar(5),fam_adddress varchar(250))");
              st.executeUpdate("create table orphan(orphan_no int unique,orphan_gender varchar(20),orphan_dob varchar(50),orphan_name varchar(200),orphan_age int,img varchar(200))");
              st.executeUpdate("create table details(adopt_no int unique,adopt_name varchar(200),adopt_gender varchar(20),adopt_dob varchar(20),adopt_age int,adopt_date varchar(20),adopt_year varchar(100),orphanage_number varchar(11),adopter_name varchar(200),adopter_mobile varchar(11),adopter_email varchar(200),adopter_addhar varchar(25),adopter_address varchar(500))");
              st.executeUpdate("create table pickup(city varchar(150),address varchar(2000),time varchar(100))");
              st.executeUpdate("create table email(current_login varchar(200))");
              st.executeUpdate("create table available(orphan_no int unique,orphan_gender varchar(20),orphan_dob varchar(50),orphan_name varchar(200),orphan_age int,img varchar(200))");
              JOptionPane.showMessageDialog(null,"Table created successfully");        
        }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            finally
            {
                    try
                    {
                    con.close();
                    st.close();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);        
                    }
            }
    } 
}


// We Have to create multiple family tables for each orphan manager inorder to store his or her data in his specific table
