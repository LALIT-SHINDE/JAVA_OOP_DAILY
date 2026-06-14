Hierarchical Inheritance in Java

Description  
This Java program demonstrates the concept of Hierarchical Inheritance using classes:
- Animal
- Dog
- Cat

Both `Dog` and `Cat` inherit properties and methods from the `Animal` class.

---

Concepts Used
- Class and Object
- Inheritance
- Hierarchical Inheritance
- Variables
- Methods
- Method Calling

---

Class Structure

Animal
├── Dog
└── Cat

---

Parent Class

Animal  
Contains:
- name
- age
- Ani() method

---

Child Classes

Dog  
Contains:
- Breed
- Speed
- bark() method

Cat  
Contains:
- color
- Meow() method

---

Features
- Demonstrates code reusability using inheritance
- Shows how child classes access parent class variables and methods
- Uses objects to store and display data

---

Sample Output

This is an Animal
Animal's Name: Tom
Animal's Age: 10
Dog's breed: German Shepherd
Dog's Speed: Fast

This is an Animal
Animal's Name: Sam
Animal's Age: 3
Cat's color: Black and White

Main2.java
University Management System using Hierarchical Inheritance in Java
Overview

This project demonstrates the concepts of Hierarchical Inheritance and Multilevel Inheritance in Java through a University Management System. The program models different university members such as Students, Professors, and Staff.

Inheritance Structure
Person
├── Student
│   ├── Undergraduate
│   └── Graduate
├── Professor
│   ├── HOD
│   └── Lecturer
└── Staff
    ├── Admin
    └── Librarian
Concepts Used
Classes and Objects
Inheritance
Hierarchical Inheritance
Multilevel Inheritance
Constructors
Method Reuse
Access Modifiers
super Keyword
Object-Oriented Programming (OOP)
Classes Description
Person

Base class containing:

Name
Age
Gender
Student

Derived from Person:

Roll Number
Course

Subclasses:

Undergraduate
Graduate
Professor

Derived from Person:

Employee ID
Department

Subclasses:

HOD
Lecturer
Staff

Derived from Person:

Staff ID

Subclasses:

Admin
Librarian
Features
Demonstrates hierarchical inheritance.
Demonstrates multilevel inheritance.
Uses constructor chaining through super.
Shows code reusability.
Models a real-world university system.
Sample Output
===== Undergraduate Student =====
Name   : Rahul
Age    : 19
Gender : Male
Roll No : 101
Course  : B.Tech
Semester : 3

===== Graduate Student =====
Name   : Priya
Age    : 24
Gender : Female
Roll No : 102
Course  : M.Tech
Specialization : Artificial Intelligence

===== Head Of Department =====
Name   : Dr. Sharma
Age    : 50
Gender : Male
Employee ID : 201
Department  : Computer Science
Experience : 25 Years

===== Lecturer =====
Name   : Ms. Anita
Age    : 34
Gender : Female
Employee ID : 202
Department  : Computer Science
Subject : Java Programming

===== Administrator =====
Name   : Ramesh
Age    : 40
Gender : Male
Staff ID : 301
Role : Office Manager

===== Librarian =====
Name   : Suman
Age    : 38
Gender : Female
Staff ID : 302
Books Managed : 15000
How to Compile
javac UniversityManagement.java
How to Run
java UniversityManagement
Learning Outcomes

After completing this project, students will understand:

Hierarchical Inheritance
Multilevel Inheritance
Constructor Chaining
Code Reusability
Object-Oriented Design
Real-World Class Modeling

