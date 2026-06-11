import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main1 {

    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arithmetic Exception
        try {
            System.out.println("Arithmetic Exception Example");
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e);
        }

        // Array Index Out Of Bounds Exception
        try {
            System.out.println("\nArray Index Exception Example");
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Caught: " + e);
        }

        // Number Format Exception
        try {
            System.out.println("\nNumber Format Exception Example");
            String str = "ABC";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Caught: " + e);
        }

        // Null Pointer Exception
        try {
            System.out.println("\nNull Pointer Exception Example");
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught: " + e);
        }

        // Input Mismatch Exception
        try {
            System.out.println("\nInput Mismatch Exception Example");
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid Input: " + e);
            sc.nextLine();
        }

        // Custom Exception
        try {
            System.out.println("\nCustom Exception Example");
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        // Finally Block
        try {
            System.out.println("\nFinally Block Example");
            int x = 20;
            int y = 2;
            System.out.println("Division Result: " + (x / y));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\nProgram completed successfully.");
        sc.close();
    }
}
