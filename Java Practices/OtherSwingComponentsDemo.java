/*1.Jtable: used to show data in form of row and columns create object of Jtable and pass data to it as parameter to add scroll bar,
 * JScrollPane is used
 * 2.JSplitpane: divide the content into two part create object of JSplitpane and pass sub window as component.
 * 3.JList: same as ocmbo box but shows all the content wihtout clicking any button. to add scroll bar scroll pane is used
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;

class OtherComp extends JFrame {
    JTable tb1;
    JSplitPane sp1;
    JList l1;
    JPopupMenu popupMenu;

    public void setOther() {
        // for JTable
        String[] col = { "ID", "Name", "Faculty" };
        String[][] data = { 
            {"1", "Ram", "CSIT"}, {"2", "Shyam", "BIM"}, {"3", "Hari", "BCA"}, {"4", "Sita", "BBA"}, {"5", "Gita", "BBS"},
            {"6", "Rita", "BSC"}, {"7", "Sita", "CSIT"}, {"8", "Gita", "BIM"}, {"9", "Rita", "BCA"}, {"10", "Sita", "BBA"} 
        };
        tb1 = new JTable(data, col);
        // setting size of table to scroll
        tb1.setPreferredScrollableViewportSize(new Dimension(100, 100));
        // adding scroll bar
        JScrollPane sp = new JScrollPane(tb1);
        add(sp); // adding scrollbar to frame

        // example on splitpane
        // adding two component to splitpane
        String[] item = { "Nepal", "India", "China", "USA", "UK", "Japan" };
        JComboBox cb = new JComboBox(item);
        JTextField t1 = new JTextField(20);
        // it takes 3 parameters
        // 1.orientation of slider (horizontal or vertical)
        // 2.sub window panel
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.add(cb);
        p2.add(t1);
        sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        // to set slider for expand and release
        sp1.setOneTouchExpandable(true);
        // to set gap between slider and component
        sp1.setDividerSize(20);
        add(sp1);

        // example on JList
        String[] item1 = { 
            "BIM", "BCA", "BBA", "BBS", "BSC", "CSIT", "BIM", "BCA", "BBA", "BBS", "BSC", "CSIT", "MBA",
            "BCA", "BBA", "BBS", "BSC", "CSIT", "BIM", "BCA", "BBA", "BBS", "MBS", "CSIT" 
        };
        l1 = new JList(item1);
        // adding scroll bar
        JScrollPane sp3 = new JScrollPane(l1);
        add(sp3);
        l1.setSelectionMode(2); // to select multiple item
        JTextField t2 = new JTextField(20);
        add(t2);
        // when item in list is clicked ListSelectionEvent is generated
        l1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // to extract item
                ArrayList<String> a = (ArrayList<String>) l1.getSelectedValuesList();
                // display data
                String s = "you selected:";
                for (String i : a) {
                    s += i + " ";
                }
                t2.setText(s);
            }
        });

        // Dialog Box
        JButton dialogButton = new JButton("Show Dialog");
        dialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a dialog box");
            }
        });
        add(dialogButton);

        // Pop-up Menu
        popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Copy");
        JMenuItem menuItem2 = new JMenuItem("Paste");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        tb1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            private void showPopup(MouseEvent e) {
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        // Color Chooser
        JButton colorButton = new JButton("Choose Color");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
                if (color != null) {
                    getContentPane().setBackground(color);
                }
            }
        });
        add(colorButton);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class OtherSwingComponentsDemo {
    public static void main(String[] args) {
        OtherComp o = new OtherComp();
        o.setOther();
    }
}
