/*Serialization is a process of writing object to a file. for this ObjectOutputStream is used Process of reading object from file is 
deserializtion for this ObjectInputStream is used
Steps:
1. Create a file and open it in write mode using byte stream
2. Create an object of ObjectOutputStream and pass filleoutputstream object as parameter and call writeObject() method
3. Close the stream
for serialization, a class whose object is to be write should implement serializable interface
*/
import java.io.*;
class Rectangle implements Serializable{
    private int length;
    private int breadth;
    public void setRectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void calcArea(){
        int area = this.length*this.breadth;
        System.out.println("Area of rectangle is "+ area);
    }
}
public class SerializationDemo {
    public static void main(String[]args){
        try{
            File f1 = new File ("obj.txt");
            f1.createNewFile();
            System.out.println("--Writing Object to File--");
//Open file for write
FileOutputStream fos = new FileOutputStream(f1);
//creating object of class
Rectangle r1 = new Rectangle();
r1.setRectangle(100, 200);
//to write object
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(r1);
System.out.println("Object Written into File");
System.out.println("--reading object from file--");
//open file in read mode 
FileInputStream fis = new FileInputStream(f1);
//to read object
ObjectInputStream ois = new ObjectInputStream(fis);
Rectangle r2 = (Rectangle)ois.readObject();//r2=r1
r2.calcArea();
//setting properties of r2
r2.setRectangle(200, 200);
r2.calcArea();
        }catch(IOException i){
            //if file is not found
            System.out.println(i);
        }catch(ClassNotFoundException c){
            //if the class whose object is to be write is not found
            System.out.println(c);
        }
    }
    
}
