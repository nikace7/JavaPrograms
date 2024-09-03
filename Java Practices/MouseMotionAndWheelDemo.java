/*mouse motion is generated when mouse is dragged and moved
 * mouse wheel event is generated when mouse wheel is rotated
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseExtra extends JFrame{
    JLabel l1;
    JTextArea t1;
    public void setMouseExtra(){
        l1 = new JLabel("Mouse Motion and Wheel Event");
        t1 = new JTextArea(20,20);
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        t1.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e){
                l1.setText("Mouse Dragged\n");
            }
            @Override
            public void mouseMoved(MouseEvent e){
                l1.setText("Mouse Moved\n");
            }
        });
        t1.addMouseWheelListener(new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e){
                l1.setText("Mouse Wheel Moved\n");
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);

    }
}
public class MouseMotionAndWheelDemo {
    public static void main(String[] args) {
        MouseExtra m = new MouseExtra();
        m.setMouseExtra();
    }
    
}
