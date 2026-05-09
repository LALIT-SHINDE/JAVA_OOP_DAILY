Java Program: User Defined Exception for Marks Out of Bound

Aim

Write a Java program to accept roll number and marks from the user.
Create a user-defined exception called MarksOutOfBoundException and throw it when marks are greater than 100.

Program

```java
import java.util.Scanner;

// User Defined Exception
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // Condition check
            if (marks > 100) {
                throw new MarksOutOfBoundException("Marks Out of Bound");
            }

            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);

        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
```

Explanation

1. A custom exception class MarksOutOfBoundException is created by extending Exception.
2. The program accepts roll number and marks from the user.
3. If marks are greater than 100, the exception is thrown.
4. The catch block handles the exception and displays an error message.

Sample Output

Valid Input

```text
Enter Roll No: 101
Enter Marks: 85
Roll No: 101
Marks: 85
```

Invalid Input

```text
Enter Roll No: 101
Enter Marks: 120
Exception: Marks Out of Bound
```

Conclusion

The program demonstrates the use of user-defined exceptions in Java to handle invalid marks input.
