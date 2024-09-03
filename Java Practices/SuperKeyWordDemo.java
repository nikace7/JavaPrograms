import java.util.*;
//In inheritance, constructor of superclass cannot be called by subclass's object and also if the method in superclass
//and subclass are same (method overriding) then super keyword should be used to call overriden method of superclass.
//uses of super keyword
//1.to call superclass constructor.
//2.to call overriden method of superclass form subclass.if botth superclass and subclass have same method and its defination
//then such condition method overriding. it is used to achieve dynamic polymorphism.
class Vehicles{
    private int reg;
    private String name;
    private String brand;
    //default constructor of superclass
    
    public Vehicles(){
        System.out.println("Default constructor of superclass");
    
    }
    //parameterized constructor of superclass
    public Vehicles(int reg, String name, String brand){
        this.reg = reg;
        this.name = name;
        this.brand = brand;
    }
    public void displayVehicle(){
        System.out.println("Vehicle registration number is "+reg);
        System.out.println("Vehicle name is "+name);
        System.out.println("Vehicle brand is "+brand);
    }
}
//creating subclass 
class Car extends Vehicles{
    private int price;
    //default constructor of subclass
    public Car(){
        System.out.println("Default constructor of subclass");
    }
    //parameterized constructor of subclass
    public Car(int price,int reg, String name, String brand){
        //to call constructor of superclass super keyword is used
        super(reg, name, brand);
        this.price = price;
    }
    //method overriding condition
    public void displayVehicle(){
        super.displayVehicle();
        System.out.println("Car price is "+price);
    }
}
public class SuperKeyWordDemo {
    public static void main(String[] args) {
        Car c1 = new Car(); //calls default constructor of superclass and subclass
        Car c2 = new Car(1000000, 1234, "Swift", "Maruti");
        c2.displayVehicle();
    }
    
}
