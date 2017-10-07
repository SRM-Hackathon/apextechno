    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginForm extends HttpServlet {

 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
      
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded!!");
           String url="jdbc:mysql://localhost:3306/indianjudiciary";
           Connection con;
            con = DriverManager.getConnection(url,"root","root");
                }
       catch(ClassNotFoundException | SQLException e)
       {
    }
       
    }

   
}
