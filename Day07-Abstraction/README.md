Day 07 - Abstraction in Java

Overview

Abstraction is one of the core principles of Object-Oriented Programming (OOP). It focuses on hiding implementation details and exposing only the essential features of an object.

In Java, abstraction is achieved using:

* Abstract Classes
* Interfaces

---
Abstract Class

An abstract class:

* Cannot be instantiated
* Can contain both abstract and non-abstract methods
* Is extended using the `extends` keyword

---
Interface

An interface:

* Contains abstract methods by default
* Supports multiple inheritance
* Is implemented using the `implements` keyword

---
Difference Between Abstract Class and Interface

| Feature     | Abstract Class      | Interface          |
| ----------- | ------------------- | ------------------ |
| Methods     | Abstract + Concrete | Abstract (default) |
| Inheritance | Single              | Multiple           |
| Keyword     | extends             | implements         |

---
Key Concepts Learned

* What abstraction is
* How abstract classes work
* How interfaces work
* Difference between abstract class and interface

---
Practice Problems

1. Create an abstract class `Shape` with an abstract method `area()`.
2. Implement the `Shape` class in a `Circle` class.
3. Create an interface `Vehicle` with a method `start()`.
4. Implement the interface in a `Bike` class.

---
Notes:
Abstraction helps in reducing complexity and improving code maintainability by hiding unnecessary details from the user.
