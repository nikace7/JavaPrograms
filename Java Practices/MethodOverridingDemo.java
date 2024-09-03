// Provide example on method overriding condition Base class
class Animal1 {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog1 extends Animal1 {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate method overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Creating an object of the base class
        Animal1 myAnimal1 = new Animal1();
        myAnimal1.sound(); // Calls the method in Animal class

        // Creating an object of the derived class
        Dog1 myDog1 = new Dog1();
        myDog1.sound(); // Calls the overridden method in Dog class

        // Demonstrating polymorphism
        Animal1 myPet = new Dog1();
        myPet.sound(); // Calls the overridden method in Dog class due to polymorphism
    }
}
