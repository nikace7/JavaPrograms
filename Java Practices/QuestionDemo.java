import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Ques extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    public void setQues(){
        l1=new JLabel("Enter the first number");
        l2=new JLabel("Enter the second number");
        l3=new JLabel("Result");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("Add");
        b2=new JButton("MUltiply");
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(l3);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //when button is pressed then  it will generate event known as action event.to handle any event listener is used so to handle
        //action event listener is used. Listener is interface so we have to use all the method of listner.it contains actionPerformed
        // method which should override.
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //exctract form field
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                l3.setText("Result is "+c);


            }
        });
        //for second button
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //exctract form field
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a*b;
                l3.setText("Result is "+c);
    }
});
}
}
public class QuestionDemo {
    public static void main(String[] args) {
        Ques q1=new Ques();
        q1.setQues();
    }
}
