import java.util.*;
//method overloading is condition in which more than one method have same name but different num of paramaeters.
//It is used to achieve static polymorphism
class Example{
    public void calc(){
        System.out.println("this is default");
    }
    public void calc(int x,int y){
        System.out.println("sum of two numbers is "+(x+y));
    }
    public int calc(int x,int y,int z){
        return (x*y*z);
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Example e = new Example();
        e.calc();//first method is called
        e.calc(10, 20);//second method is called
        int x = e.calc(10, 20, 30);
        System.out.println("result is "+x);
    }
    
}
