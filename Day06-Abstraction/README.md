Overview

Today’s focus was on Abstraction, one of the core concepts of Object-Oriented Programming (OOP).

Abstraction is the process of hiding implementation details and showing only the essential functionality to the user.

🔍 Key Concepts Learned

Abstraction
Hides internal implementation
Shows only required features
Improves security and reduces complexity

Types of Abstraction in Java

1. Abstract Class
Declared using abstract keyword
Can have:
Abstract methods (no body)
Concrete methods (with body)
Cannot be instantiated

2. Interface
Used to achieve full abstraction
Contains method declarations
Supports multiple inheritance
Methods are public by default

Java Abstraction Programs

Overview

This repository contains Java programs based on the concept of Abstraction in Object-Oriented Programming (OOP).

Abstraction hides implementation details and shows only essential features of an object. In Java, abstraction is mainly achieved using abstract classes and abstract methods.

Programs Included

1. Animal Abstraction Program

This program demonstrates abstraction using an `Animal` abstract class and child classes:

* Dog
* Cat
* Cow

Each subclass implements the `sound()` method differently.

Concepts Used

* Abstract class
* Abstract method
* Inheritance
* Method overriding
* Polymorphism

Classes Used

* Animal
* Dog
* Cat
* Cow
* AbstractionDemo

Sample Output

```text id="8mhq4v"
Dog barks
Animal is sleeping
Dog is running

Cat meows
Animal is sleeping
Cat is jumping

Cow moos
Animal is sleeping
Cow is eating grass
```

2. Employee Management Abstraction Program

This program demonstrates abstraction using an Employee Management System.

An abstract class named `Employee` is inherited by:

* Developer
* Manager
* Tester

Each employee type has different work responsibilities and bonus calculations.

Concepts Used

* Abstraction
* Inheritance
* Method overriding
* Constructors
* Polymorphism

### Classes Used

* Employee
* Developer
* Manager
* Tester
* AbstractionCompany

Features

Developer

* Writes code
* Debugs applications
* Attends meetings

Manager

* Conducts meetings
* Assigns tasks
* Checks performance

Tester

* Executes test cases
* Reports bugs
* Performs automation testing

Sample Output

```text id="esn32u"
Employee Name : Rahul
Employee ID   : 101
Salary        : 70000.0
Rahul logged into system
Rahul is developing software
Rahul writes Java code
Rahul is debugging application
Rahul attends technical meeting
Developer Bonus : 14000.0
Rahul logged out from system
```

How to Run

Compile the Java file:

```bash id="a8z2ez"
javac FileName.java
```

Run the program:

```bash id="x8pczx"
java ClassName
```
Advantages of Abstraction

* Reduces complexity
* Improves security
* Increases reusability
* Makes maintenance easier

Conclusion

These programs help beginners understand abstraction in Java using practical examples.

Method overriding
Inheritance
🔹 Interface Example
Created an interface Vehicle
Implemented in class Car


