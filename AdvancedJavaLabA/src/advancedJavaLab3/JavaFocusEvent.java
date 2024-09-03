/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedJavaLab3;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Focuses extends JFrame{
    JLabel l1;
    JTextField t1,t2;
    public void setFocuses(){
        l1=new JLabel("Label:");
        t1=new JTextField(20);
        t2=new JTextField(20);
        add(l1);
        add(t1);
        add(t2);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        t1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                l1.setText("t1 get focus");
            }
             @Override
            public void focusLost(FocusEvent e) {
                l1.setText("t1 lost focus");
            }
         });
    }
 }
public class JavaFocusEvent {   
    public static void main(String[] args) {
        Focuses f1=new Focuses();
        f1.setFocuses();
    }
}
