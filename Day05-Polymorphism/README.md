Polymorphism in Java

Overview

Polymorphism means "many forms". In Java, it allows a method or object to behave differently depending on the context.

There are two types of polymorphism:

* Compile-time polymorphism (Method Overloading)
* Runtime polymorphism (Method Overriding)

---
1. Method Overloading (Compile-Time Polymorphism)

Method overloading occurs when multiple methods have the same name but different parameters.
The method to be executed is decided at compile time.

Output:
8
10

---
2. Method Overriding (Runtime Polymorphism)

Method overriding occurs when a child class provides a specific implementation of a method that is already defined in the parent class.
The method to be executed is decided at runtime.

Output:
Dog barks

---
Key Differences

| Feature     | Overloading  | Overriding |
| ----------- | ------------ | ---------- |
| Parameters  | Different    | Same       |
| Inheritance | Not required | Required   |
| Time        | Compile-time | Runtime    |
| Method Name | Same         | Same       |


