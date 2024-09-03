/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit4;

/*
creating a form and connecting with database
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;

class Forms extends JFrame implements ActionListener{
    
    //create reference of swing component
    
    JLabel l0,l1,l2,l3,l4,l5,l6,l7;
    JTextField t0,t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    
    JButton b1;
    public void setForms(){
        l0=new JLabel("Id");
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Repassword");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Country");
        l7=new JLabel("Result");
        t0=new JTextField(20);
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2=new JPasswordField(20);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        c1=new JCheckBox("C");
        c2=new JCheckBox("C++");
        c3=new JCheckBox("Java");
        
        String[] item={"Nepal","USA","Japan","Other"};
        cb1=new JComboBox(item);
        
        b1=new JButton("Submit");
        add(l0);add(t0);
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(l6);add(cb1);
        add(b1);add(l7);
        
        
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //extract all the form field
                String id=t0.getText();
                String uname=t1.getText();
                String pass=p1.getText();
                String repass=p2.getText();
                String gender="";
                if(r1.isSelected()){
                    gender=r1.getText();
                } else{
                    gender=r2.getText();
                }
                String course="";
                if(c1.isSelected()){
                    course+=c1.getText();
                }
                if(c2.isSelected()){
                    course+=c2.getText();
                }
                if(c3.isSelected()){
                    course+=c3.getText();
                }
                //combobox here
                String country="";
                if(cb1.getSelectedItem()!=null){
                    country=(String)cb1.getSelectedItem();
                }
                //connection to database
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsita";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
                //inserting data into database
                String insQuery="insert into tbl_reg values(?,?,?,?,?,?,?)";
                PreparedStatement ps=conn.prepareStatement(insQuery);
                ps.setString(1,id);
                ps.setString(2,uname);
                ps.setString(3,pass);
                ps.setString(4,repass);
                ps.setString(5,gender);
                ps.setString(6,course);
                ps.setString(7,country);
                int res=ps.executeUpdate();
                if(res>0){
                    l7.setText("Data inserted");
                }
                }catch(SQLException s){
                    System.out.println(s);
                }catch(ClassNotFoundException c){
                    System.out.println(c);
                }
                
            }
        });
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

  
    

}
public class SwingConnectionDemo {
    public static void main(String[] args) {
        Forms form=new Forms();
        form.setForms();
    }
}