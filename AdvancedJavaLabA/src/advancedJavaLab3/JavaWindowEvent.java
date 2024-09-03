
package advancedJavaLab3;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class WindowDemo{
    JFrame f1;
    public void setWindow(){
        f1=new JFrame("Window Listener");
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(3);
         f1.setLayout(new FlowLayout());
        f1.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
             @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("window closing");
            }
             @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window closed");
            }
             @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("winodw minimize (Iconify)");
            }
             @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window maximized (deiconify)");
            }
             @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("window activated");
            }
             @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("window deactivated");
            }
         });
}
} 
 class WindowAd{
    public void setWindows(){
        JFrame frame=new JFrame("Window Adapter");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
         frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowIconified(WindowEvent e){
                System.out.println("Window Adapter minimized");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                System.out.println("Window Adapter maximized");
            }
        });
}
}
public class JavaWindowEvent {
    public static void main(String[] args) {
        WindowDemo wind=new WindowDemo();
        wind.setWindow();
        WindowAd win=new WindowAd();
        win.setWindows();
    }
 }
