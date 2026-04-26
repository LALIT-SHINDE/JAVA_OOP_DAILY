// Method Overriding (Runtime)
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting

        a.sound();  
    }
}
/*
output: 
Dog barks
*/
