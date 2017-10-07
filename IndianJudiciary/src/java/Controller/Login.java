/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vaio
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter pw=response.getWriter();
        try (PrintWriter out = response.getWriter()) {
           String _username=request.getParameter("txtusername");
           String _password=request.getParameter("txtpassword");
            try
            {
                 if(_username!=null)
                {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/indianjudiciary","root","root");
                    String Query="select * from login_jud where user_jud=? and pass_jud=?";
                    PreparedStatement pstm= con.prepareStatement(Query);
                    pstm.setString(1,_username);
                    pstm.setString(2,_password);
                    ResultSet rs=pstm.executeQuery();
                    if(rs.next())
                    
                    {
                        response.sendRedirect("welcome.jsp");
                    }
                    else
                    {
                      pw.print("<font color=red>username,"+"password didn't match</font>");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request, response);
                    }
                }
            }
            catch(IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | ServletException ex)
            {
                out.println("Exception :"+ex.getMessage());
            }
        }
            
        }
}

