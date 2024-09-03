
package advancedjavalab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Form extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    JButton b1;
    JTextArea tx1;
    public void setForms(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Repassword");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Country");
        l7=new JLabel("Result");
        t1=new JTextField(10);
        p1=new JPasswordField(10);
        p2=new JPasswordField(10);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        bg=new ButtonGroup();
        tx1=new JTextArea(10,10);
        l8=new JLabel("Description");
        bg.add(r1);
        bg.add(r2);
        c1=new JCheckBox("C");
        c2=new JCheckBox("C++");
        c3=new JCheckBox("Java");
        String[] item={"Nepal","USA","Japan","Other"};
        cb1=new JComboBox(item);
        b1=new JButton("Submit");
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(l6);add(cb1);
        add(l8);add(tx1);
        add(b1);add(l7);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //extract all the form field
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
                String country="";
                if(cb1.getSelectedItem()!=null){
                    country=(String)cb1.getSelectedItem();
                }
                String description=tx1.getText();
                l7.setText("<html>Username is: "+uname+
                        "<br>Password is: "+pass+
                        "<br>Repass is: "+repass+
                        "<br>Gender is: "+gender+
                        "<br>Course is: "+course+
                        "<br>COuntry is: "+country+
                        "<br>Description is: "+description
                        +"</html>"
                );
            }
        });
    }
    
}
public class FormSwing {
    public static void main(String[] args) {
        Form form=new Form();
        form.setForms();
    }
}
