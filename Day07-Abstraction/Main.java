// 1. Abstract Class
abstract class Animal {
    abstract void sound(); 

    void eat() {           
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
/*
Output: 
Dog barks
This animal eats food
*/
