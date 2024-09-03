/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedJavaLab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 class Listt extends JFrame{
    JList li1;
    JLabel l1;
    Listt(){
         
        li1=new JList(items);
        l1=new JLabel("Result: ");
        add(li1);
        add(l1);
         li1.setSelectionMode(2);//multi select
        li1.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent l) {
                //extracting selected value
                ArrayList<String> ar1=(ArrayList)li1.getSelectedValuesList();
                //displaying the data
                String ans="List Selection Event ** You selected: ";
                for(String data:ar1){
                    ans+=data + " ";
                }
                l1.setText(ans);
            }
         });
            setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
    }
}
public class JavaListSelectionEvent {
    public static void main(String[] args) {
        Listt list=new Listt();
     }
}
