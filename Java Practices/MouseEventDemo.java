/*
for every acrion like clicking button, using mouse,keypress,etc event us generated.for evey event, listener is used to listen 
such event.Listener is an interface that contains list of method to handle event.if listener is used  then all the method defined by
it should be compulsory used.this is known as delegation event method.
 * button->action event
 * radio button->action event
 * check box->action event and item event
 * combobox->action event and item event
 * list->list selection event
 * MuseEvent: genertaed when mouse is clicked, press, release, enter,exit
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseEg extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setMouse(){
        JLabel l1=new JLabel("Mouse Event");
        t1 = new JTextField(20);
        //when some mouse action is performed in t1 then mouse listener is called
        t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                //when mouse is clicked and release
                l1.setText("Mouse Clicked");
            }
            @Override
            public void mousePressed(MouseEvent e){
                //when mouse continously pressed
                l1.setText("Mouse Pressed");
            }
            @Override
            public void mouseReleased(MouseEvent e){
                //when mouse is released
                l1.setText("Mouse Released");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                //when mouse entered in t1
                l1.setText("Mouse Entered"+e.getX()+","+e.getY());
            }
            @Override
            public void mouseExited(MouseEvent e){
                //when mouse exited from t1
                l1.setText("Mouse Exited");
            }

        });
        add(l1);add(t1);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);

    }
}
public class MouseEventDemo {
    public static void main(String[] args) {
        MouseEg m = new MouseEg();
        m.setMouse();
    }
}
