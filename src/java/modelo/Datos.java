/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.sql.*;
/**
 *
 * @author ILP
 */
public class Datos {
    
    Connection x;
    
    PreparedStatement y;
    
    
   public Datos(){
       try
        {
            Class.forName("com.mysql.jdbc.Driver");
            x=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/prueba","root","root"
            );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
   }
   
   public int registra(String w, String z){
       int m=0;
       try {
           y=x.prepareStatement("insert into cliente values(?,?);");
           y.setString(1, w);
           y.setString(2, z);
           m=y.executeUpdate();
       } catch (Exception e) {
       }
       
       return m;
   }
    
}
