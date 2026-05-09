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
