DAY02-Constructors
Objective:
     - Understand how constructors work in Java and how they are used to initialize objects automatically.

# Java Constructor Demo

## Overview

This project demonstrates the use of Constructors in Java. Constructors are special methods that are automatically invoked when an object is created. The program shows both Default Constructor and Parameterized Constructor concepts.

## Objectives

* Understand constructors in Java
* Learn object initialization
* Demonstrate constructor overloading
* Practice Object-Oriented Programming concepts

## Features

* Default Constructor
* Parameterized Constructor
* Object Creation
* Method Invocation
* Displaying Object Information
* Constructor Overloading

## Classes Used

### Student Class

The Student class contains:

#### Data Members

* rollNo
* name
* marks

#### Constructors

##### Default Constructor

Initializes object with default values.

```java
Student() {
    rollNo = 0;
    name = "Unknown";
    marks = 0.0;
}
```

##### Parameterized Constructor

Initializes object with user-defined values.

```java
Student(int r, String n, double m) {
    rollNo = r;
    name = n;
    marks = m;
}
```

#### Methods

* display()

Displays student details on the screen.

## Main Class

### ConstructorDemo

The main class performs the following operations:

1. Creates an object using the Default Constructor.
2. Creates objects using the Parameterized Constructor.
3. Displays student information.
4. Demonstrates constructor overloading.

## Sample Output

Default Constructor Called
Parameterized Constructor Called
Parameterized Constructor Called

Student 1 Details

Roll No: 0
Name: Unknown
Marks: 0.0

Student 2 Details

Roll No: 101
Name: Siddharth
Marks: 89.5

Student 3 Details

Roll No: 102
Name: Rahul
Marks: 92.0

## Concepts Covered

* Classes and Objects
* Constructors
* Default Constructor
* Parameterized Constructor
* Constructor Overloading
* Instance Variables
* Methods
* Object-Oriented Programming (OOP)

## Advantages of Constructors

* Automatic object initialization
* Reduces code duplication
* Improves code readability
* Makes object creation easier
* Supports multiple initialization methods

## Requirements

* JDK 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans, VS Code)

## How to Run

1. Save the file as `ConstructorDemo.java`
2. Compile the program:

```bash
javac ConstructorDemo.java
```

3. Run the program:

```bash
java ConstructorDemo
```

## Learning Outcome

After completing this project, students will be able to:

* Define and use constructors
* Differentiate between default and parameterized constructors
* Create and initialize objects efficiently
* Apply constructor overloading in Java programs
