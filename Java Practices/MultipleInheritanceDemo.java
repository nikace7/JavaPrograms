// Demonstrate multiple inheritance using interface Interface 1
interface Movable {
    void move();
}

// Interface 2
interface Inspectable {
    void inspect();
}

// Class implementing both interfaces
class Vehicle1 implements Movable, Inspectable {
    String name;

    // Constructor
    public Vehicle1(String name) {
        this.name = name;
    }

    // Implementing the move method from Movable interface
    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }

    // Implementing the inspect method from Inspectable interface
    @Override
    public void inspect() {
        System.out.println(name + " is being inspected.");
    }
}

// Main class to demonstrate multiple inheritance using interfaces
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Vehicle
        Vehicle1 myVehicle1 = new Vehicle1("Car");

        // Calling methods implemented from interfaces
        myVehicle1.move();       // Output: Car is moving.
        myVehicle1.inspect();    // Output: Car is being inspected.
    }
}
