// Parent class
class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal name is " + name);
    }
}

// Child class 1
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class 2
class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

// Main class to demonstrate the inheritance
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.display();
        dog.bark();

        // Creating an object of Cat
        Cat cat = new Cat();
        cat.setName("Whiskers");
        cat.display();
        cat.meow();
    }
}
