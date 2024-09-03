//to conncet with external datasourcr like xml file,sql server etc JDBC driver is reuqired
//Steps:
//step 1: intialize JDBC driver 



import java.sql.*;

public class JDBCDemo{
    public static void main(String[] args){
        try{
            //step 1: intialize driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: create connection with database
            Connection conn;
            String url = "jdbc:mysql://localhost:3306/primecsita";
            String susername="root";
            String spassword="";
            conn = DriverManager.getConnection(url,susername,spassword);
            if(conn!=null){
                System.out.println("Connection established");
            }
            else{
                System.out.println("Connection failed");
            }
            // // creating table
            // String tblQuery= "create table tbl_reg (id int primary key,username varchar(50),password varchar(50),repassword varhar(50),gender varchar(10),course varchar(50),country varchar(50))";
                            
            // Statement statement = conn.createStatement();
            // statement.executeUpdate(tblQuery);
            // System.out.println("Table created");
            // conn.close();
            //inserting data into database
            // System.out.println("----------------INserting data-----------------");
            // String insertQuery = "insert into tbl_reg values(1,'Nikesh','nikesh','nikesh','abcd' , 'CSIT','Nepal')";
            // Statement statement = conn.createStatement();
            // int result = statement.executeUpdate(insertQuery);
            // if(result>0){
            //     System.out.println("Data inserted");
            // }
            // else{
            //     System.out.println("Data not inserted");
            // }

            System.out.println("----------------Fetching data-----------------");
            String disQuery = "select * from tbl_reg";
            Statement st1 = conn.createStatement();
            //to fetch data executeQuery is used which return objectResultSet
            ResultSet rs = st1.executeQuery(disQuery);
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String repassword = rs.getString("repassword");
                String gender = rs.getString("gender");
                String course = rs.getString("course");
                String country = rs.getString("country");
                System.out.println("ID: "+id+" Username: "+username+" Password: "+password+" Repassword: "+repassword+" Gender:"+gender+" Course: "+course+" Country: "+country);
            }


        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }

}