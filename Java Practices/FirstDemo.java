// Define the class with an instance variable, constructor, and method
class MyClass {
    // Instance variable
    String message;
    
    // Constructor
    public MyClass(String message) {
        this.message = message;
    }
    
    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

// Class with the main method
public class FirstDemo {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObject = new MyClass("Hello, World!");
        
        // Call the displayMessage method
        myObject.displayMessage();
    }
}