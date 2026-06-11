Java Program: User Defined Exception for Marks Out of Bound

Aim

Write a Java program to accept roll number and marks from the user.
Create a user-defined exception called MarksOutOfBoundException and throw it when marks are greater than 100.

Explanation

1. A custom exception class MarksOutOfBoundException is created by extending Exception.
2. The program accepts roll number and marks from the user.
3. If marks are greater than 100, the exception is thrown.
4. The catch block handles the exception and displays an error message.

Sample Output

Valid Input
```
Enter Roll No: 101
Enter Marks: 85
Roll No: 101
Marks: 85
```

Invalid Input
```
Enter Roll No: 101
Enter Marks: 120
Exception: Marks Out of Bound
```

Conclusion

The program demonstrates the use of user-defined exceptions in Java to handle invalid marks input.

Java Advanced Exception Handling
Overview

This project demonstrates Advanced Exception Handling concepts in Java. It covers built-in exceptions, custom exceptions, nested try-catch blocks, multiple catch blocks, the throw and throws keywords, and the finally block.

Features
Multiple Catch Blocks
Nested Try-Catch
Custom Exception Creation
Use of throw Keyword
Use of throws Keyword
Finally Block
File Handling Exception
Technologies Used
Java
JDK 8 or higher
Program Structure
Custom Exception

class InvalidAgeException extends Exception

Main Concepts Demonstrated
ArrayIndexOutOfBoundsException
ArithmeticException
FileNotFoundException
Custom Exception
Nested Try-Catch
Finally Block
How to Run
Compile

javac AdvancedExceptionDemo.java

Execute

java AdvancedExceptionDemo

Sample Output

Array Index Exception: java.lang.ArrayIndexOutOfBoundsException

Inner Catch: java.lang.ArithmeticException: / by zero

Outer Catch: java.lang.ArrayIndexOutOfBoundsException

Custom Exception: Age is less than 18.

File Not Found: java.io.FileNotFoundException

Finally block executed.

Program Ended Successfully.

Learning Outcomes

After completing this project, you will understand:

Java Exception Handling
Checked and Unchecked Exceptions
Custom Exceptions
Exception Propagation
File Handling Exceptions
Best Practices for Error Handling
