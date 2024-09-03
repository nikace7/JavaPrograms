//interface is like a abstract class but difference is that it only contains list of abstract method
//interface doesnot contains constructor variable declared inside interface are constant declared using final keyword
//declared using fianl keyword its object canot be declared using final keyword its object cannot be created
//it is used to achieve multiple inheritance i.e. one class can implement two or more interface both abstract class 
//and interface provide abstraction. to use interface, normal class have to provide body part of all the method of interface
interface Calculation1{
    ///contains list of method without body part
    void findSum(int x, int y);
    void findDiff(int x, int y);
}
interface Calculation2{
    void findMul(int x, int y);
    void findDiv(int x, int y);
}
//multiple inheritance condition
class Solutions implements Calculation1,Calculation2{
    @Override
    public void findSum(int x, int y){
        System.out.println("Sum is "+(x+y));
    }
    @Override
    public void findDiff(int x, int y){
        System.out.println("Difference is "+(x-y));
    }
    @Override
    public void findMul(int x, int y){
        System.out.println("Multiplication is "+(x*y));
    }
    @Override
    public void findDiv(int x, int y){
        System.out.println("Division is "+(x/y));
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Solutions s1 = new Solutions();
        s1.findSum(10, 20);
        s1.findDiff(30, 40);
        s1.findMul(50, 60);
        s1.findDiv(160, 80);
        //dyanmic method dispatch: it is a process of assigning sub class's object to reference vairable of superclass.now 
        //superclass ref will call subclass version of overriden method
        Calculation1 c1; //reference vairable
        Solutions s2 = new Solutions();//object of subclass
        c1 = s2;//dynamic method 
        //c1 can call only that method that it have
        c1.findSum(10, 20);
        c1.findDiff(30, 40);
        Calculation2 c2;
        c2 = s2;
        c2.findMul(50, 60);
        c2.findDiv(160, 80);

    }

    
}
