import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Focuses extends JFrame{
    JLabel l1;
    JButton b1,b2;
    public void setFocus(){
        l1 = new JLabel("Focus Event");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        setLayout(new FlowLayout());
        add(l1);
        add(b1);
        add(b2);
        b1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                System.out.println("Button 1 Focus Gained");
            }
            @Override
            public void focusLost(FocusEvent e){
                System.out.println("Button 1 Focus Lost");
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
public class FocusEventDemo {
    public static void main(String[] args) {
        Focuses f = new Focuses();
        f.setFocus();
    }
    
}
