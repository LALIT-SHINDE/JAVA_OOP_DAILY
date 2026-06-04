class Student {
    int rollNo;
    String name;
    double marks;
  
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
        System.out.println("Default Constructor Called");
    }

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Main2{
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(
                101,
                "Siddharth",
                89.5
        );

        Student s3 = new Student(
                102,
                "Rahul",
                92.0
        );

        System.out.println("\nStudent 1 Details");
        s1.display();

        System.out.println("Student 2 Details");
        s2.display();

        System.out.println("Student 3 Details");
        s3.display();
    }
}
/*
OUTPUT:
Default Constructor Called
Parameterized Constructor Called
Parameterized Constructor Called

Student 1 Details
Roll No: 0
Name: Unknown
Marks: 0.0

Student 2 Details
Roll No: 101
Name: Siddharth
Marks: 89.5

Student 3 Details
Roll No: 102
Name: Rahul
Marks: 92.0
*/
