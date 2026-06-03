abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog is running");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }

    void jump() {
        System.out.println("Cat is jumping");
    }
}

class Cow extends Animal {

    void sound() {
        System.out.println("Cow moos");
    }

    void eat() {
        System.out.println("Cow is eating grass");
    }
}

public class Main2{

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
        d.run();

        System.out.println();

        Cat c = new Cat();
        c.sound();
        c.sleep();
        c.jump();

        System.out.println();

        Cow cw = new Cow();
        cw.sound();
        cw.sleep();
        cw.eat();
    }
}
/*
Output:
Dog barks
Animal is sleeping
Dog is running

Cat meows
Animal is sleeping
Cat is jumping

Cow moos
Animal is sleeping
Cow is eating grass
*/
