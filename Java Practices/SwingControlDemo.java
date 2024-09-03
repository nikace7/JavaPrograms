/*SWing is used to create GUI controls and desktop application. it contain list classes that allow to create different graphical
 * component as well as different event.
 * on the top level, Container is used which helps place component. in swing top level container is Jframe.it usees certain features of
 * AWT following package should be imported
 * javax.swing.*;-> swing controls
 * java.awt.*;-> AWT controls
 * java.awt.event.*;-> event 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Form extends JFrame{
    //inheritig properties of JFrame
    //create instance var of controls
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    JButton b1;
    //create object of each control
    public void setForm(){
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("RePassword");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");
        l6 = new JLabel("Country");
        l7 = new JLabel("Result");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
    //radio button should be place im ButtonGroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);//add to bgroup
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");
        c3 = new JCheckBox("C++");
    //combox: list of item should be created
        String[] country = {"India","USA","UK","Nepal"};
        cb1 = new JComboBox(country);
        b1 = new JButton("Submit");
    //adding components into Jframe (window)
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(l6);add(cb1);
        add(b1);add(l7);
    //setting properties of jframe 
        setLayout(new FlowLayout());//How content should be display
        setSize(300,300);//size of window
        setVisible(true);//Window on
        //if window is closed then program should be closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //after button preseed
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //extract form field
                String name = t1.getText();
                String pass = p1.getText();
                String repass = p2.getText();
                //radio button 
                String gender="";
                if(r1.isSelected()){
                    gender = r1.getText();
                }else{
                    gender = r2.getText();
            }
            //checkbox
            String course="";
            if(c1.isSelected()){
                course+= c1.getText();
            }if(c2.isSelected()){
                course+= c2.getText();
            }if(c3.isSelected()){
                course+= c3.getText();
            }
            //combox
            String country = "";
            if(cb1.getSelectedItem().toString()!=null){
                country = cb1.getSelectedItem().toString();
            }
            //display result
l7.setText("Name: "+name+"\nPassword: "+pass+"\nRePassword: "+repass+"\nGender"+gender+"\nCourse:"+course+"\nCountry: "+country);
//putting data into file

try{
    File f1 = new File("data.txt");
    if(!f1.exists()){
        f1.createNewFile();
        //open file in write mode
        FileWriter fw = new FileWriter(f1);
        fw.write("Name: "+name+"\nPassword: "+pass+"\nRePassword: "+repass+"\nGender"+gender+"\nCourse:"+course+"\nCountry: "+country);
        fw.close();
    }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    });
}
}
    

        
public class SwingControlDemo {
    public static void main(String[] args) {
        Form f = new Form();
        f.setForm();
    }
}
