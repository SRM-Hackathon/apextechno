<%-- 
    Document   : index
    Created on : 2 Oct, 2017, 5:30:51 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <br><br>
    <center>LOGIN</center><br>
        <form action="Controller" method="POST">
        <table align="center">
            <tr>
                <th align="right">UserName:</th>
                <td><input type="text" name="txtusername" placeholder="Username"></td>
            </tr>
            <tr>
                 <th align="right">Password:</th>
                 <td><input type="password" name="txtpassword" placeholder="Password"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="Log In"></td>
            </tr>
        </table>
            </form>
        
    </body>
</html>
