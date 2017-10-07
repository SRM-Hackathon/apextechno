
package Dao;

import Connection.MyCon;
import Modal.RegisterModal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegisterDao 
{
      Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
   
   public boolean insertRegisterModal(RegisterModal rm) throws SQLException

   {
    con=MyCon.getconnection();
    String sql;
     sql="insert into reg_jud values(?,?,?,?,?,?,?)";
     ps=con.prepareStatement(sql);
     ps.setInt(1, rm.getJ_id());
     ps.setString(2,rm.getJ_user());
     ps.setString(3,rm.getJ_pass());
     ps.setString(4,rm.getAdd());
     ps.setInt(5,rm.getCity_id());
     ps.setInt(6,rm.getState_id());
     ps.setString(7,rm.getMob());
     
        
     
     if(ps.executeUpdate()>0)

         return true;
     else
         return false;
   }

   // public boolean insertRegisterModal(RegisterModal rm) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//}
