Hybrid Inheritance in Java
Overview

This project demonstrates Hybrid Inheritance in Java using a combination of classes and interfaces.

Java does not support multiple inheritance through classes directly. However, hybrid inheritance can be achieved by combining Single Inheritance, Hierarchical Inheritance, Multilevel Inheritance, and Multiple Inheritance using Interfaces.

This example models an employee management system containing Developers, Testers, Managers, and Project Managers.

Inheritance Structure

Person

↓

Employee

↓ ↓ ↓

Developer Tester Manager

                  ↓

           ProjectManager

Interfaces Used:

PersonActions

EmployeeActions

ManagerActions

Classes and Interfaces
PersonActions Interface

Defines the method:

void displayPersonInfo();

EmployeeActions Interface

Defines the method:

void work();

ManagerActions Interface

Defines the method:

void manageTeam();

Classes
Person

Base class containing:

name
age
showPersonDetails()
Employee

Inherits from Person and implements PersonActions and EmployeeActions.

Contains:

empId
salary
displayPersonInfo()
work()
Developer

Inherits from Employee.

Contains:

programmingLanguage
writeCode()
Tester

Inherits from Employee.

Contains:

testingTool
testApplication()
Manager

Inherits from Employee and implements ManagerActions.

Contains:

teamSize
manageTeam()
ProjectManager

Inherits from Manager.

Contains:

projectName
monitorProject()
Types of Inheritance Used
Single Inheritance

Employee extends Person

Employee inherits properties and methods from Person.

Hierarchical Inheritance

Developer extends Employee

Tester extends Employee

Manager extends Employee

Multiple child classes inherit from the same parent class.

Multilevel Inheritance

Person

Employee

Manager

ProjectManager

Inheritance occurs through multiple levels.

Multiple Inheritance Using Interfaces

Employee implements PersonActions and EmployeeActions.

Manager implements ManagerActions.

Java supports multiple inheritance through interfaces.

Features
Demonstrates a real-world Employee Management System.
Uses interfaces for abstraction.
Uses inheritance for code reusability.
Demonstrates method implementation and overriding.
Shows the Hybrid Inheritance concept in Java.
Sample Output

===== DEVELOPER DETAILS =====

Employee Information

Name : Siddharth

Age : 21

Employee ID : 101

Salary : 60000.0

Siddharth is working on assigned tasks.

Siddharth is coding in Java.

===== TESTER DETAILS =====

Employee Information

Name : Rahul

Age : 22

Employee ID : 102

Salary : 50000.0

Rahul is working on assigned tasks.

Rahul is testing using Selenium.

===== PROJECT MANAGER DETAILS =====

Employee Information

Name : Amit

Age : 35

Employee ID : 103

Salary : 120000.0

Amit is working on assigned tasks.

Amit is managing a team of 10 members.

Amit is monitoring project: Banking System.

Conclusion

This project successfully demonstrates Hybrid Inheritance in Java by combining Single Inheritance, Hierarchical Inheritance, Multilevel Inheritance, and Interface-based Multiple Inheritance. It provides a practical example of how inheritance and interfaces can be used together to create flexible and reusable object-oriented programs.
