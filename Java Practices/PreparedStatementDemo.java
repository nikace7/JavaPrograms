
/*prepared statement is used to handle dynamic data
*/
import java.sql.*;
import java.util.*;
class PreparedEg{
    Connection conn;
    public void inserData(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primecsita";
            String susername="root";
            String spassword="";
            conn = DriverManager.getConnection(url,susername,spassword);
            //inserting data into tbl_reg use prepare stmt take input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = sc.next();
            System.out.println("Enter username:");
            String username = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();
            System.out.println("Enter repassword:");
            String repassword = sc.next();
            System.out.println("Enter Gender:");
            String gender = sc.next();
            System.out.println("Enter Course:");
            String course = sc.next();
            System.out.println("Enter Country:");
            String country = sc.next();
            //query 
            String insQuery="insert into tbl_reg values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insQuery);
            ps.setString(1,id);
            ps.setString(2,username);
            ps.setString(3,password);
            ps.setString(4,repassword);
            ps.setString(5,gender);
            ps.setString(6,course);
            ps.setString(7,country);
            int result = ps.executeUpdate();\
            if(result>0){
                System.out.println(result+"Data inserted");
            }
            else{
                System.out.println("Data not inserted");
            }
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}


public class PreparedStatementDemo {
    public static void main(String[] args){
        PreparedEg pe = new PreparedEg();
        pe.inserData();
    }
    
}
