
package customer_details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    Connection con =null;
     
     public static Connection connect()
     {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","");
             System.out.println("Database Connected");
             return con;
         }
         catch(Exception e)
         {
             System.out.println("Database Not Connected");
             return null;
         }
         
     }  
}
