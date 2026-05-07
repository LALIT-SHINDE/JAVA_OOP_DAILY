class Vehicle{
    void vehicle(){
        System.out.println("This is Vehicle Class");
    }
}

class Car extends Vehicle{
    void car(){
        System.out.println("This is Car Class");
    }
}

class Bike extends Vehicle{
    void bike(){
        System.out.println("This is Bike Class");
    }
}

class SportsCar extends Car{
    void sportsCar(){
        System.out.println("This is Sports Car Class");
    }
}

class HybridInheritance{
    public static void main(String args[]){

        SportsCar s = new SportsCar();

        s.vehicle();
        s.car();
        s.sportsCar();

        System.out.println();

        Bike b = new Bike();

        b.vehicle();
        b.bike();
    }
}
/* 
Hybrid Inheritance in Java

Description  
This Java program demonstrates the concept of Hybrid Inheritance using classes:
- Vehicle
- Car
- Bike
- SportsCar

The program combines:
- Hierarchical Inheritance
- Multilevel Inheritance

---

Concepts Used
- Class and Object
- Inheritance
- Hierarchical Inheritance
- Multilevel Inheritance
- Hybrid Inheritance
- Method Calling

---

Inheritance Structure

        Vehicle
       /       \
     Car       Bike
      ↓
  SportsCar

---

Class Details

Vehicle  
Contains:
- vehicle() method

Car  
Inherits from Vehicle  
Contains:
- car() method

Bike  
Inherits from Vehicle  
Contains:
- bike() method

SportsCar  
Inherits from Car  
Contains:
- sportsCar() method

---

Features
- Demonstrates hybrid inheritance
- Shows parent-child class relationships
- Demonstrates method inheritance
- Uses objects to access inherited methods
- Demonstrates code reusability

---

Sample Output

This is Vehicle Class
This is Car Class
This is Sports Car Class

This is Vehicle Class
This is Bike Class

---

Types of Inheritance Used

Hierarchical Inheritance:
Vehicle → Car
Vehicle → Bike

Multilevel Inheritance:
Vehicle → Car → SportsCar

Combination of both forms Hybrid Inheritance. 
*/
