/*Window Event is generated when window is opened, running, close, minimized, maximized */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinEg {
    JFrame f;
    public void setWindow(){
        f = new JFrame("Window Event");
        f.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e){
                System.out.println("Window Opened");
            }
            @Override
            public void windowClosing(WindowEvent e){
                //when window is closed using tab bar
                System.out.println("Window Closing");
            }
            @Override
            
            public void windowClosed(WindowEvent e){
                //when window is closed using close button
                System.out.println("Window Closed");
            }
            @Override
            public void windowIconified(WindowEvent e){
                System.out.println("Window Iconified");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                System.out.println("Window Deiconified");
            }
            @Override
            public void windowActivated(WindowEvent e){
                System.out.println("Window Activated");
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                System.out.println("Window Deactivated");
            }
        });
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
}
public class WindowEventDemo {
    public static void main(String[] args) {
        WinEg w = new WinEg();
        w.setWindow();
    }
    
}
