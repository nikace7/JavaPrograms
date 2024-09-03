/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedJavaLab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Keys extends JFrame{
     JTextArea t1,t2;
    JLabel l1,l2;
    public void setKeys(){
        l1=new JLabel("Result");
        t1=new JTextArea(10,10);
        l2=new JLabel("Result 2");
        t2=new JTextArea(10,10);
         t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent k){
                l1.setText("key typed");
            }
            @Override
            public void keyPressed(KeyEvent k){
                l1.setText("key pressed");
            }
            @Override
            public void keyReleased(KeyEvent k){
                l1.setText("key realeased");
            }
        });
         t2.addKeyListener(new KeyAdapter(){
           @Override 
           public void keyReleased(KeyEvent k){
                l2.setText("Key Adapter: key realeased");
            }
        });
        add(t1);
        add(l1);
        add(t2);
         add(l2);
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setLayout(new FlowLayout());
    }
}
public class JavaKeyEvent {
    public static void main(String[] args) {
        Keys key=new Keys();
        key.setKeys();
    }
 }
