
Day 07 - Interfaces in Java

Overview

Interfaces in Java are used to achieve full abstraction. They define a contract that classes must follow. Any class that implements an interface must provide implementations for all its methods.

Interfaces are widely used in real-world applications to design flexible and scalable systems.

---

What is an Interface?

An interface:

* Contains abstract methods by default
* Cannot be instantiated
* Is implemented using the `implements` keyword
* Supports multiple inheritance

---

Explanation

An interface acts like a blueprint. It specifies what a class should do, but not how it should do it.

Different classes can implement the same interface in different ways. This allows flexibility and makes code easier to manage and extend.

---

Multiple Inheritance Using Interfaces

Java does not support multiple inheritance with classes, but it allows it using interfaces. A class can implement multiple interfaces and provide behavior for all of them.

---

Key Concepts Learned

* Interface as a contract
* Implementation using `implements`
* Achieving full abstraction
* Multiple inheritance using interfaces
* Runtime polymorphism with interfaces

---

Practice Problems

1. Create an interface `Vehicle` with method `start()`

2. Implement `Vehicle` in:

   * `Car`
   * `Bike`

3. Create an interface `Shape` with method `area()`

4. Implement:

   * `Rectangle`
   * `Circle`

---

