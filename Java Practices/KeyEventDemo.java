/*Key Event is generated when key of key board is pressed, released or typed.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyEg extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setKey(){
        l1 = new JLabel("Key Event");
        t1 = new JTextField(20);
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                //when key is typed
                l1.setText("Key Typed");
            }
            @Override
            public void keyPressed(KeyEvent e){
                //when key is pressed
                l1.setText("Key Pressed");
            }
            @Override
            public void keyReleased(KeyEvent e){
                //when key is released
                l1.setText("Key Released");
            }
        });
        add(l1);add(t1);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
public class KeyEventDemo {
    public static void main(String[] args) {
        KeyEg k = new KeyEg();
        k.setKey();
    }


    
}
