import java.io.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main2 {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {

        // Multiple Catch Blocks
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        // Nested Try-Catch
        try {
            try {
                int num = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Catch: " + e);
            }

            int arr[] = {1, 2, 3};
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: " + e);
        }

        // Custom Exception
        try {
            validateAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // Finally Block
        try {
            FileReader file = new FileReader("test.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program Ended Successfully.");
    }
}
