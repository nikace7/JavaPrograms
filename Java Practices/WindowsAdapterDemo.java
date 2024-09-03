/*Window listener contains 7 method and all should be compulsary used as listener is interface.
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowAp{
    public void setWin(){
        JFrame f1 = new JFrame("Window Adapter");
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setDefaultCloseOperation(3);
        f1.addWindowListener(new WindowAdapter(){
            @Override
            public void windowIconified(WindowEvent e){
                System.out.println("Window Iconified");
            }
        });
    }
}
public class WindowsAdapterDemo {
    public static void main(String[] args) {
        WindowAp w = new WindowAp();
        w.setWin();
    }
    
}
