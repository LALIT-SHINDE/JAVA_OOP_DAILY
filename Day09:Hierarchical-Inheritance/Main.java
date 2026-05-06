class Animal{
    String name;
    int age;
    void Ani(){
        System.out.println("\nThis is an Animal");
        System.out.println("Animal's Name: "+name+"\nAnimal's Age: "+age);
    }
}

class Dog extends Animal{
    String Breed, Speed;
    void bark(){
        System.out.println("Dog's breed: "+Breed+"\nDog's Speed: "+Speed);
    }
}

class Cat extends Animal{
    String color;
    void Meow(){
        System.out.println("Cat's color: "+color);
    }
}

class HierarchicalInheritance {
    public static void main(String args[]){

        Dog a = new Dog();
        a.name = "Tom";
        a.age = 10;
        a.Breed = "German Shepherd";
        a.Speed = "Fast";

        a.Ani();
        a.bark();

        Cat b = new Cat();
        b.name = "Sam";
        b.age = 3;
        b.color = "Black and White";

        b.Ani();
        b.Meow();
    }
}
