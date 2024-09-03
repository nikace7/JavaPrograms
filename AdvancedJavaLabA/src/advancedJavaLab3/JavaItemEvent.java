/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedJavaLab3;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Itemm extends JFrame{
    JCheckBox c1,c2,c3;
    JLabel l1,l2;
    Itemm(){
        l1=new JLabel("Languages: ");
        l2=new JLabel("Result: ");
        c1=new JCheckBox("C");
        c2=new JCheckBox("C++");
         add(l1);
        add(c1);
        add(c2);
        add(l2);
         c1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText("C Checkbox: "     
            + (e.getStateChange()==1?"checked":"unchecked")); 
            }
         });
        c2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText("C++ Checkbox: "     
            + (e.getStateChange()==1?"checked":"unchecked")); 
            }
         });
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
     }
}
 public class JavaItemEvent {
    public static void main(String[] args) {
        Itemm ite=new Itemm();
    }
}
