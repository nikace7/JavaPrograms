/*using listener we have to all the method defined by it but using adapter class we can use any method as per our need.
 * for eg mouse listener contains 5 method and we have to used all of that now using adapter calss we can use any of them
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MAdapter extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setMAdapter(){
        l1 = new JLabel("Mouse Adapter");
        t1 = new JTextField(20);
        t1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                l1.setText("Mouse Entered");
            }
        });
        add(l1);add(t1);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
public class MouseAdapterDemo {
    public static void main(String[] args) {
        MAdapter m = new MAdapter();
        m.setMAdapter();
    }
    
}
