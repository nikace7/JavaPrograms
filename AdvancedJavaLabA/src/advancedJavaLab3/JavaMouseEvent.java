/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedJavaLab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Mousee extends JFrame{
    JTextArea t1,t2;
    JLabel l1,l2;
    public void setMouse(){
        l1=new JLabel("result: ");
        t1=new JTextArea(10,10);
        l2=new JLabel("result 2: ");
        t2=new JTextArea(10,10);
         //handling mouse event in t1
        t1.addMouseListener(new MouseListener(){
           @Override
           public void mouseClicked(MouseEvent e){
               //when mouse is clicked and released
               l1.setText("mouse clicked");
           }
           @Override
           public void mousePressed(MouseEvent e){
               //when mouse is ccontinuosuly pressed
               l1.setText("mouse pressed");
           }
           @Override
           public void mouseReleased(MouseEvent e){
               //when mouse is clicked inside component and released outside component
               l1.setText("mouse released");
           }
           @Override
           public void mouseEntered(MouseEvent e){
               //when mouse enters component
               l1.setText("mouse Enter");
           }
           @Override
           public void mouseExited(MouseEvent e){
               //when mouse exits component
               l1.setText("mouse Exit");
           }
        });
         t2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                l2.setText("Mouse Adapter: Mouse Enter");
            }
        });
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setLayout(new FlowLayout());
    }
}
public class JavaMouseEvent {
    public static void main(String[] args) {
        Mousee mouse=new Mousee();
    mouse.setMouse();
    }
}
