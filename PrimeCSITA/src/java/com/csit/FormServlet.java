
package com.csit;

//to process form or any http request servelet shouyld be create by extending HttpServlet class
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class FormServlet extends HttpServlet {
    //override post method
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //extract all the form field
        String id = req.getParameter("id");
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        String repass = req.getParameter("repass");
        String gender = req.getParameter("gender");
        //for multiple value
        String []course = req.getParameterValues("crc");
       //convert into string
       String cr = "";
       for(String c:course){
           cr+="c+";
       }
       String country = req.getParameter("con");
       //displaying form fields
       res.setContentType("text/html");
       PrintWriter pw =res.getWriter();
       pw.println("<h2> id is "+id+" uname is " +uname+" pass is "+pass+" repass is  "+repass+" gender is "+gender+" course is "+cr+" country is "
               +country+" </h2> ");
    
    try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
           
            String url="jdbc:mysql://localhost:3306/primecsita";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                 
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            
            String insQuery=
                    "insert into tbl_reg values(?,?,?,?,?,?,?)";
            PreparedStatement ps =
                    conn.prepareStatement(insQuery);
            ps.setString(1, id);
            ps.setString(2, uname);
            ps.setString(3, pass);
            ps.setString(4, repass);
            ps.setString(5, gender);
            ps.setString(6, cr);
            ps.setString(7, country);
            ps.executeUpdate();
              
}catch(SQLException s){
                    System.out.println(s);
                }catch(ClassNotFoundException c){
                    System.out.println(c);
                }
    }}
    
