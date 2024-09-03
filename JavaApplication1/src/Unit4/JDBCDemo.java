package Unit4;

/**
to connect with external data source like xml file, sql server  we need JDBC driver. for such driver mysql-connector jar needs to downloaded

step to connect with database
1. Insert the JDBC driver (jar file) in library
*2. Initialize JDBC driver using Class.forName()
* 3. use connection object to connect with database
* for this DriverManager.getConnection() is used it takes three parameter (protocol, serverusername, serverpassword)
* 4. Write appropriate query
* 5. execute query
* 6. close connection
* for insert update delete -> execute ()=>returns true or false | executeUodate() => return 1,0
* for select -> executeQuery
* 
* 
* 
*/

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        //step 1: initialize druver (jarfile)
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsita";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            if(conn!=null){
                System.out.println("Database COnnection successfull");
            }else{
                System.out.println("Database Not connected");
            }
//        //creating table: tbl_reg
//            String tblQuery="create table tbl_reg ("
//                    + "id int primary key,username varchar(50),"
//                    + "password varchar(50),"
//                    + "repassword varchar(50),"
//                    + "gender varchar(50),"
//                    + "course varchar(50),"
//                    + "country varchar(50) )";
//            //execute query: Statement object is used
//            Statement st=conn.createStatement();
//            st.execute(tblQuery);
//            System.out.println("Table created");
//            conn.close();

//            //inserting data int database
//            System.out.println("--------Inserting data into db--------------");
//            String insQuery="insert into tbl_reg values(1,'nikesh','abcd','abcd','male','csit','nepal')";
//            Statement st=conn.createStatement();
//            int res=st.executeUpdate(insQuery);
//            if(res>0){
//                
//            System.out.println(res+" data inserted into table");
//            }
//            conn.close();
       //fetching data from database
           System.out.println("-----------fetching data from database---------------");
           String fetchQuery="select * from tbl_reg";
           Statement st=conn.createStatement();
           //to fetch data excuteQuery is used which return object ResultSet
           ResultSet rs=st.executeQuery(fetchQuery);
           while(rs.next()){
               //to fetch data
               int id=rs.getInt("id");
              String uname=rs.getString("username");
              String pass=rs.getString("password");
              String repass=rs.getString("repassword");
              String gender=rs.getString("gender");
              String course=rs.getString("course");
              String country=rs.getString("country");
                System.out.println("id is: "+id+"\nUsername is: "+uname
                       +"\nPassword is: "+pass+
                       "\nRepassword is: "+repass+
                       "\nGender is: "+gender+
                       "\nCOurse is: "+course+
                        "\ncountry is: "+country);
            }
            
            
           

        }catch(ClassNotFoundException c){
            //throw if driver not found
            System.out.println(c);
        }catch(SQLException s){
            //throw if sql query is not correct
            System.out.println(s);
        }
    }
}