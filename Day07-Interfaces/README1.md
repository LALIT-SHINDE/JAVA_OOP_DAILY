# Java Interfaces - Advanced Example

## Overview

This project demonstrates advanced concepts of Java Interfaces using an Employee Management System.

The program covers:

* Interface Implementation
* Multiple Interfaces
* Interface Inheritance
* Default Methods
* Static Methods
* Functional Interfaces
* Lambda Expressions
* Runtime Polymorphism
* Method Overriding
* Abstraction

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

---

## Project Structure

```text
EmployeeOperations      -> Interface
SalaryOperations        -> Interface
AttendanceOperations    -> Interface
ManagementOperations    -> Interface

NotificationService     -> Functional Interface

Employee               -> Base Class
Manager                -> Derived Class
Developer              -> Derived Class
Tester                 -> Derived Class
HR                     -> Derived Class

InterfaceDemo          -> Main Class
```

---

## Features

### Employee Operations

* Add Employee
* Remove Employee
* Display Employee Information

### Salary Operations

* Calculate Monthly Salary
* Calculate Bonus

### Attendance Operations

* Mark Attendance

### Management Operations

* Generate Reports
* Team Management

### Notification Services

* Email Notifications
* SMS Notifications

---

## Interface Concepts Demonstrated

### 1. Multiple Interface Implementation

A class can implement multiple interfaces.

```java
class Employee implements ManagementOperations,
                          AttendanceOperations
```

### 2. Interface Inheritance

```java
interface ManagementOperations
extends EmployeeOperations,
        SalaryOperations
```

### 3. Default Methods

```java
default void welcomeMessage()
```

### 4. Static Methods

```java
static void companyPolicy()
```

### 5. Functional Interface

```java
@FunctionalInterface
interface NotificationService
```

### 6. Lambda Expressions

```java
NotificationService email =
(message) -> {
    System.out.println(message);
};
```

### 7. Runtime Polymorphism

```java
Employee e = new Developer(...);
```

---

## Sample Output

```text
Welcome to Employee Management System
Rahul added successfully.

Employee ID: 101
Employee Name: Rahul
Employee Salary: 30000.0

Developer Salary: 50000.0
Bonus: 5000.0
Total Salary: 55000.0

Email Notification:
Salary credited successfully.

Program Completed Successfully
```

---

## Learning Outcomes

After completing this project, students will understand:

* What interfaces are in Java
* Why interfaces are used
* How multiple inheritance is achieved using interfaces
* Difference between abstract classes and interfaces
* Use of default and static methods
* Functional interfaces and lambda expressions
* Runtime polymorphism using interfaces

---

## Author

Siddharth

Advanced Java Interface Demonstration Project
