/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author soham
 */
public class InsertUpdateDelete 
{    
    public static void setData(String Query,String msg)
    {
        Statement st=null;
        try
        {
            Connection con=Connectionprovider.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
            JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try
            {
                
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void main(String args[])
    {
        
    }
    
}

