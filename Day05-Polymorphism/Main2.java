// Java Program to Demonstrate Polymorphism

// Parent Class
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child Class 3
class Cow extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main Class
public class Main2 {

    public static void main(String[] args) {

        // Parent class reference
        Animal a;

        // Dog object
        a = new Dog();
        a.sound();

        // Cat object
        a = new Cat();
        a.sound();

        // Cow object
        a = new Cow();
        a.sound();

        System.out.println();

        // Array of Animal objects
        Animal animals[] = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        // Loop to demonstrate runtime polymorphism
        System.out.println("Using Loop:");

        for (Animal obj : animals) {
            obj.sound();
        }
    }
}
// output:
// Dog barks
// Cat meows
// Cow moos

// Using Loop:
// Dog barks
// Cat meows
// Cow moos
