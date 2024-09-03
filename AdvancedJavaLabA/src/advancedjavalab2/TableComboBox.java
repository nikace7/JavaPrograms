package advancedjavalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;
class OtherEg extends JFrame{
    JTextField t1;
    JComboBox cb1;
    JTable tb1;
     public void setOther(){
        String[] data={"java","c","c++"};
        cb1=new JComboBox(data);
        JPanel p1=new JPanel();
        p1.add(cb1);
        String[] col={"id","name","faculty"};
        String [][] data1={{"1","ram","csit"}
                ,{"2","Nikesh","CIST"}
                ,{"3","Aceww","BCA"}
                ,{"4","AceXLuffy","bba"}
                ,{"5","wwecA","iST"}
                ,{"6","AceXL","CIST"}
                ,{"2","Nikesh","CIST"}
                ,{"3","Aceww","BCA"}
                ,{"4","AceXLuffy","bba"}
                ,{"5","wwecA","iST"}
                ,{"6","AceXL","CIST"}
                };
        tb1=new JTable(data1,col);
        tb1.setPreferredScrollableViewportSize(new Dimension(100,100));
        add(p1);
        add(tb1);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
    }
}
public class TableComboBox {
    public static void main(String[] args) {
        OtherEg as=new OtherEg();
        as.setOther();
    }
}
