/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit4;

/**
row set is more flexible than result set as it is by default scrolllable and updatable
 */

import java.sql.*;
import javax.sql.rowset.*;

public class RowSetDemo {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet jrs=RowSetProvider.newFactory().createJdbcRowSet();
        //creating connection
        String url="jdbc:mysql://localhost:3306/primecsita";
        jrs.setUrl(url);
        jrs.setUsername("root");
        jrs.setPassword("");
        jrs.setCommand("Select * from tbl_reg");
        jrs.execute();
            System.out.println("=====fetch 2nd row data==");
            jrs.absolute(2);
             System.out.println("id is: "+jrs.getString("id"));
            System.out.println("username is: "+jrs.getString("username"));
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}