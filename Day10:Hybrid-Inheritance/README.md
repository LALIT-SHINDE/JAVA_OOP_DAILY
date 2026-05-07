Hybrid Inheritance in Java

Description  
This Java program demonstrates the concept of Hybrid Inheritance using:
- Hierarchical Inheritance
- Multilevel Inheritance

The program uses classes:
- Animal
- Dog
- Cat
- Puppy

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

        Animal
       /      \
     Dog      Cat
      ↓
    Puppy

---

Class Details

Animal  
Contains:
- animal() method

Dog  
Inherits from Animal  
Contains:
- dog() method

Cat  
Inherits from Animal  
Contains:
- cat() method

Puppy  
Inherits from Dog  
Contains:
- puppy() method

Features
- Demonstrates code reusability using inheritance
- Shows hybrid inheritance structure
- Demonstrates parent and child class relationships
- Uses objects to access inherited methods

---

Sample Output

This is Animal Class
This is Dog Class
This is Puppy Class

This is Animal Class
This is Cat Class

---

Types of Inheritance Used

Hierarchical Inheritance:
Animal → Dog
Animal → Cat

Multilevel Inheritance:
Animal → Dog → Puppy

Combination of both forms Hybrid Inheritance.
