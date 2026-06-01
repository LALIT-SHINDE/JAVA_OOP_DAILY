// Java Program to Demonstrate Inheritance
// Parent Class
class Person {
    String name;
    int age;

    // Method to set details
    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class inheriting Person
class Student extends Person {
    int rollNo;
    String course;

    // Method to set student data
    void setStudentData(int r, String c) {
        rollNo = r;
        course = c;
    }

    // Method to display student data
    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Another Child Class
class Teacher extends Person {
    String subject;
    double salary;

    // Method to set teacher data
    void setTeacherData(String s, double sal) {
        subject = s;
        salary = sal;
    }

    // Method to display teacher data
    void displayTeacher() {
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {

        // Creating Student Object
        Student s1 = new Student();
        s1.setDetails("Siddharth", 20);
        s1.setStudentData(101, "Computer Science");

        System.out.println("----- Student Details -----");
        s1.displayPerson();
        s1.displayStudent();

        System.out.println();

        // Creating Teacher Object
        Teacher t1 = new Teacher();
        t1.setDetails("Rahul", 40);
        t1.setTeacherData("Java Programming", 55000);

        System.out.println("----- Teacher Details -----");
        t1.displayPerson();
        t1.displayTeacher();
    }
}

/*
OUTPUT:
----- Student Details -----
Name: Siddharth
Age: 20
Roll Number: 101
Course: Computer Science

----- Teacher Details -----
Name: Rahul
Age: 40
Subject: Java Programming
Salary: 55000.0

*/
