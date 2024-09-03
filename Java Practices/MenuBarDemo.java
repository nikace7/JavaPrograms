// menubar is a tab that contains sequence of item known as meanu and menu contain list of other sub items known as menuitem
//Step 1: create menubar
//Step 2: create menu and menu item
//add menu item to menu and menu into menu bar
import javax.swing.*;
import java.awt.*;
class Menus extends JFrame{
    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    public void setMenu(){
        mb = new JMenuBar();
        m1 = new JMenu("File");
        //for shortcut key memonic is used
        m1.setMnemonic('f');
        //creating menu item for menu bar
        JMenuItem mi1 = new JMenuItem("New",'N');
        JMenuItem mi2 = new JMenuItem("Open",'O');
        JMenuItem mi3 = new JMenuItem("Save",'S');
        m4 = new JMenu("Save As");
        JMenuItem mi4 = new JMenuItem("Save As PDF");
        JMenuItem mi5 = new JMenuItem("Save As Text");
        m4.add(mi4);m4.add(mi5);
        //add m4 into menu 
        m1.add(m4);
        m1.add(mi1);m1.add(mi2);m1.add(mi3);
        //adding menu to menubar
        mb.add(m1);
        //for menu m2-> adding radioButtion menu item
        m2 = new JMenu("Edit");
        //adding radio button menu item
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Cut");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("Copy");
        JRadioButtonMenuItem r3 = new JRadioButtonMenuItem("Paste");
        m2.add(r1);m2.add(r2);m2.add(r3);
        //adding menu to menubar
        mb.add(m2);
        m3 = new JMenu("View");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Zoom In");
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("Zoom Out");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("Full Screen");
        m3.add(c1);m3.add(c2);m3.add(c3);
        mb.add(m3);
        add(mb);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        Menus m = new Menus();
        m.setMenu();
    }
    
}
