// Base class
class Person1 {
    String name;
    int age;

    // Constructor of the Person class
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    public void displayPerson1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee1 extends Person1 {
    String employeeId;

    // Constructor of the Employee class
    public Employee1(String name, int age, String employeeId) {
        // Call to the constructor of the Person class
        super(name, age);
        this.employeeId = employeeId;
        System.out.println("Employee constructor called");
    }

    public void displayEmployee1() {
        displayPerson1();
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class to demonstrate the constructor calls
public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee1 employee1 = new Employee1("Nikesh", 22, "E12345");
        // Displaying properties
        employee1.displayEmployee1();
    }
}
