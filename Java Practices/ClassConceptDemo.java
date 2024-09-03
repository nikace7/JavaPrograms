import java.util.*;
//creating a class, instance variable, constructor, method and accessing them with object
class Box {
    //instance variable or attribute: variables declared inside a class. it should in private
    private int length;
    private int breadth;    
    private int height;
    //default constructor: this constructor is automatically inserted by JVM. it doesnot have any parameter.
    //constructor is invoked when object of class is created.
    public Box() {
        System.out.println("this is default constructor");
    }
    //parameterized constructor: this constructor has parameter.
    public Box(int length, int breadth, int height) {
        
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    //method: function declared inside a class
    public void displayData() {
        System.out.println("length of box is "+this.length);
        System.out.println("breadth of box is "+this.breadth);
        System.out.println("height of box is "+this.height);
    }
    public int calcArea(){
        int area = this.length * this.breadth * this.height;
        return area;    
    }

}
public class ClassConceptDemo {
    public static void main(String[] args) {
        //creating object of class Box
        Box b1 = new Box();//calls default constructor
        b1.displayData();
        int area1 = b1.calcArea();
        System.out.println("area of box is "+area1);
        Box b2 = new Box(50, 60, 70);//calls parameterized constructor
        b2.displayData();
        int area2 = b2.calcArea();
        System.out.println("area of box is "+area2);
    }
}