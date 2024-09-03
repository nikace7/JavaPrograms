import java.util.*;
//process of acquiring properties of one class into another class is called inheritance such that the class which 
//is acquiring properties is called child class and the class which is giving properties is called parent class.
//subclass can access all the properties of parent class except private members.
//types of inheritance
//1.Single level inheritance : one or more subclass inherits one parent class
//2.Multiple level inheritance : one class get inherit by second class and second class inturn gets inherit by third class.
//A gets inherited by B and B gets inherited by C then A is parent of B and B is parent of C.
//3.Multiple inheritance : one class gets inherited by more than one class.this is not possible using class but possible using interface.

//Single level inheritance example
class Vehicle{
    int reg;
    String name;
    String brand;
    public void setVehicle(int reg,String name,String brand){
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
//to inherit a class extends keyword is used
class Bike extends Vehicle{
    int mileage;
    public void setBike(int mileage){
        setVehicle(reg, name, brand);
        this.mileage = mileage;
    }
    public void displayBike(){
        displayVehicle();
        System.out.println("Bike mileage is "+mileage);
    }


}
class ElectricBike extends Bike{
    int battery;
    public void setElectricBike(int battery){
        setBike(mileage);
        this.battery = battery;
    }
    public void displayElectricBike(){
        displayBike();
        System.out.println("Battery capacity is "+battery);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        //accessing parent class property 
        b1.setVehicle(1234, "NS 200", "Bajaj");
        b1.displayVehicle();
        //accessing child property using child class object
        b1.setBike( 40);
        b1.displayBike();
        //creating object of grand child
        ElectricBike eb = new ElectricBike();
        //accessing grandparent property: Vehicle
        eb.setVehicle(777, "Cyborg", "Tesla");
        eb.setBike(170);
        //acessing own propertys
        eb.setElectricBike(500);    
        eb.displayElectricBike();
        

    }
}
