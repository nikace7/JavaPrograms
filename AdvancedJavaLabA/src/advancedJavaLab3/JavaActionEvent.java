package advancedJavaLab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; class JavaEv extends JFrame{
    JLabel l1,l2,l3;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JButton b1;
     JavaEv(){
        l1=new JLabel("Gender: ");
        l3=new JLabel("Result for Action event: ");
         bg=new ButtonGroup();
        r1=new JRadioButton("Radio Button 1");
        r2=new JRadioButton("Radio Button 2");
        bg.add(r1);
        bg.add(r2);
        b1=new JButton("Button 1");
         add(b1);
        add(l1);
        add(r1);
        add(r2);
        add(l3);
         r1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l3.setText("Action result: "+r1.getText()+" Selected");
             }
        });
        r2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l3.setText("Action result: "+r2.getText()+" Selected");
            }
        });
         b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l3.setText(b1.getText()+" Clicked");
            }
        });
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
  }         
} public class JavaActionEvent {
    public static void main(String[] args) {
        JavaEv ev=new JavaEv();
     }
}
