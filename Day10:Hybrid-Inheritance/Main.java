// Hybrid Inheritance
class Animal{
    void animal(){
        System.out.println("This is Animal Class");
    }
}

class Dog extends Animal{
    void dog(){
        System.out.println("This is Dog Class");
    }
}

class Cat extends Animal{
    void cat(){
        System.out.println("This is Cat Class");
    }
}

class Puppy extends Dog{
    void puppy(){
        System.out.println("This is Puppy Class");
    }
}

class Main{
    public static void main(String args[]){

        Puppy p = new Puppy();

        p.animal();
        p.dog();
        p.puppy();

        System.out.println();

        Cat c = new Cat();

        c.animal();
        c.cat();
    }
}
