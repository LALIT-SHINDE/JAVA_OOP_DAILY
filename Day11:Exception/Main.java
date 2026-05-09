import java.util.Scanner;

// User Defined Exception
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // Check condition
            if (marks > 100) {
                throw new MarksOutOfBoundException("Marks Out of Bound");
            }

            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);

        } 
        catch (MarksOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
