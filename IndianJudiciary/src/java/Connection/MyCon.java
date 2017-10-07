
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyCon 
{
    static Connection con=null;

 public static Connection getconnection()
 {
     try
     {
        Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver load");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/indianjudiciary","root","root");
         System.out.println("Database connected");
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return(con);
 }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

