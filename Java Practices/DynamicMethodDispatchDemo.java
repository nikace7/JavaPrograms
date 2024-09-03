//Provide example on dynamic method dispatch Base class
class Shape {
    // Method to be overridden
    public double area() {
        System.out.println("Shape area is undefined");
        return 0;
    }
}

// Derived class 1
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class 2
class Rectangle1 extends Shape {
    double length;
    double width;

    // Constructor
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area method
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Shape myCircle = new Circle(5.0);
        Shape myRectangle1 = new Rectangle1(4.0, 6.0);

        // Dynamic method dispatch
        System.out.println("Area of the circle: " + myCircle.area());
        System.out.println("Area of the rectangle: " + myRectangle1.area());
    }
}
