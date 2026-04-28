// 2 Interface
interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
/*
Output:
Cat meows
*/
