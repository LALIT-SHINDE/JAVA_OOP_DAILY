// Java Program to Demonstrate Constructors

class Student {

    int id;
    String name;
    double marks;

    // Default Constructor
    Student() {
        id = 0;
        name = "Not Assigned";
        marks = 0.0;

        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(int i, String n, double m) {

        id = i;
        name = n;
        marks = m;

        System.out.println("Parameterized Constructor Called");
    }

    // Method to display details
    void displayDetails() {

        System.out.println("Student ID    : " + id);
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
        System.out.println("--------------------------------");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating object using default constructor
        Student s1 = new Student();

        // Displaying details
        s1.displayDetails();

        // Creating object using parameterized constructor
        Student s2 = new Student(101, "Siddharth", 89.5);

        // Displaying details
        s2.displayDetails();

        // Another object
        Student s3 = new Student(102, "Rahul", 92.0);

        // Displaying details
        s3.displayDetails();

        // End of Program
        System.out.println("Program Executed Successfully");
    }
}
