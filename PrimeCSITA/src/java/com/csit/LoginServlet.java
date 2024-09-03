
package com.csit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //extract all the form field
        
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
      
        //check whether username and password match with db or not. if yes display data of such perosn
 
    try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
           
            String url="jdbc:mysql://localhost:3306/primecsita";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                 
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            
           String checkQuery = "select * from tbl_reg" + "where username=? and password=?" ;
           PreparedStatement ps =
                   conn.prepareStatement(checkQuery);
           ps.setString(1, uname);
           ps.setString(2, pass);
           //execute query and if success display data in table
           ResultSet rs = ps.executeQuery();
               res.setContentType("text/html");
               PrintWriter pw = res.getWriter();
               pw.println("<table>"+"<tr>"+
                       "<th>id</th>"+
                       "<th>Username</th>"
                       +"<th>Password</th>"
                        +"<th>Repassword</th>"
                        +"<th>Gender</th>"
                        +"<th>Course</th>"
                       +"<th>Country</th>"
                       +"</tr>"
               );
               
               while(rs.next()){
                   pw.print("<tr>"
                   +"<td>"+rs.getString("id")+"</td>"
                   +"<td>"+rs.getString("username")+"</td>"
                   +"<td>"+rs.getString("password")+"</td>"
                   +"<td>"+rs.getString("repassword")+"</td>"
                   +"<td>"+rs.getString("gender")+"</td>"
                   +"<td>"+rs.getString("course")+"</td>"
                   +"<td>"+rs.getString("country")+"</td>"
                   +"</tr>");
               }
               pw.print("</table>");

}catch(SQLException s){
                    System.out.println(s);
                }catch(ClassNotFoundException c){
                    System.out.println(c);
                }
    }}
    
    

