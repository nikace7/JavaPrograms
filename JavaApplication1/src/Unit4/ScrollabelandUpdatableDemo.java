
package Unit4;

/**
using only result set we can fetch data from row 1 to row 2 to row 3 sand so on. but using scroll label and update table result set
* we can fetch data of any row and also can be updated
*/
import java.sql.*;
public class ScrollabelandUpdatableDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsita";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            String disQuery ="select * from tbl_reg";
            //creating scrolllavel and updatetable result set
            int scroll=ResultSet.TYPE_SCROLL_SENSITIVE;
            //to create updatable: to do update operation
            int updatable=ResultSet.CONCUR_UPDATABLE;
            //to make readonly
            int read=ResultSet.CONCUR_READ_ONLY;
            Statement st=conn.createStatement(scroll,updatable);
            ResultSet rs=st.executeQuery(disQuery);
            System.out.println("---fetching last row data---------");
            rs.last();
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            System.out.println("password is: "+rs.getString("password"));
            System.out.println("repassword is: "+rs.getString("repassword"));
            System.out.println("gender is: "+rs.getString("gender"));
            System.out.println("course is: "+rs.getString("course"));
            System.out.println("country is: "+rs.getString("country"));
            
            //to fetch data of any row
            System.out.println("-------fetching 3rd row data");
            rs.absolute(3);
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            
            
            System.out.println("-------fetching 2nd row data");
            rs.absolute(3);
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            
            //update username to sam for row 2
            System.out.println("-------updating 2nd row data");
            rs.absolute(2);
            rs.updateString("username", "Popo");
            rs.updateRow();
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
        }catch(SQLException s){
            System.out.println(s);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
    }
}