Day 03 – Encapsulation in Java

Encapsulation in Java

This project demonstrates the concept of Encapsulation in Java. Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP). It involves wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data using access modifiers.

In this program, the Student class encapsulates student information such as roll number, name, age, and marks by declaring them as private and providing public getter and setter methods to access and modify them.

Features

Private data members

Public getter and setter methods

Data validation in setter methods

Grade calculation based on marks

Display student details

Demonstrates secure data access

Technologies Used

Java

Object-Oriented Programming (OOP)

Class Structure

Student Class

Attributes

rollNo – Student roll number

name – Student name

age – Student age

marks – Student marks

Methods

setRollNo()

getRollNo()

setName()

getName()

setAge()

getAge()

setMarks()

getMarks()

getGrade()

displayDetails()

EncapsulationDemo Class

Contains the main() method that:

Creates Student objects

Sets values using setter methods

Retrieves values using getter methods

Displays student information

Demonstrates data security through encapsulation

How Encapsulation is Implemented

The variables are declared as private, preventing direct access from outside the class.

Public setter methods validate data before updating values.

Getter methods provide controlled access to private data.

Sample Output

Student Information

Roll Number : 101

Name : Siddharth

Age : 20

Marks : 88.5

Grade : B

Student Information

Roll Number : 102

Name : Rahul

Age : 21

Marks : 95.0

Grade : A

Advantages of Encapsulation

Improves data security

Prevents unauthorized access

Provides data validation

Increases code maintainability

Enhances modularity

Makes programs easier to manage
