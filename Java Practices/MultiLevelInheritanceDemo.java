/* Provide an example of multi-level inheritance of your choice in java
Base class*/
class Person {
    String name;
    int age;

    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class 1
class Employee extends Person {
    String employeeId;

    public void setEmployee(String name, int age, String employeeId) {
        setPerson(name, age);
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class 2
class Manager extends Employee {
    String department;

    public void setManager(String name, int age, String employeeId, String department) {
        setEmployee(name, age, employeeId);
        this.department = department;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

// Main class to demonstrate the multi-level inheritance
public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Manager
        Manager manager = new Manager();
        // Setting properties of Person, Employee, and Manager
        manager.setManager("Nikesh", 17, "E12345", "HR");
        // Displaying properties of Person, Employee, and Manager
        manager.displayManager();
    }
}
