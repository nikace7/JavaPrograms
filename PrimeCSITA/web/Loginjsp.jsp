<%-- 
    Document   : Loginjsp
    Created on : 4 Sept 2024, 07:36:51
    Author     : khatr
jsp stands for java server page. in jsp we cann add both end and backend program. 
front is done by html and backend is done by using declaretive symbol.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i =1; i<=10; i++){
            out.println("this is jsp");
            }
        %>
             <form method="post" action ="FormServlet">
                <label>id</label>
                <input type="text" name ="id"/><br>
                <label>Username</label>
                <input type="text" name ="uname"/><br>
                <label>password</label>
                <input type="password" name ="pass"/><br>
                <label>re-password</label>
                <input type="password" name ="repass"/><br>
                <label>gender</label>
                <input type="radio" name ="gender" value="female"/>Female
                <input type="radio" name ="gender" value="male"/>Male<br>
                <label>course</label>
                <input type="checkbox" name ="crc" value="java">Java
                <input type="checkbox" name ="crc" value="Python">Python
                <input type="checkbox" name ="crc" value="C++">C++
                <br><!-- comment -->
                <label>Country</label>
                <select name="con">
                    <option value="-1">Choose Country</option>
                    <option value="NEPAL">Nepal</option>
                    <option value="INDIA">India</option>
                    <option value="USA">USA</option>
                    <option value="Others">Others</option>
                
                
                </select><br/>
                <input type="submit" name="submit" value="submit"><br/>
                <a href="LoginForm.html">Click here</a>
            </form>
        <%
        String id = request.getParameter("id");
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");
        String gender = request.getParameter("gender");
        //for multiple value
        String []course = request.getParameterValues("crc");
       //convert into string
       String cr = "";
       if(course!=null){
       for(String c:course){
    
           cr+="c+";
       }
            }
       String country = request.getParameter("con");
       //add database code here
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
    
        %>
    </body>
</html>
