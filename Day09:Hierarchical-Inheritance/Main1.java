class Person {

    String name;
    int age;

    void getPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {

    int rollNo;
    String course;

    void getStudentDetails(int rollNo, String course) {
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
    }
}

class Teacher extends Person {

    int teacherId;
    String subject;

    void getTeacherDetails(int teacherId, String subject) {
        this.teacherId = teacherId;
        this.subject = subject;
    }

    void displayTeacherDetails() {
        System.out.println("Teacher ID : " + teacherId);
        System.out.println("Subject    : " + subject);
    }
}

class Staff extends Person {

    int staffId;
    String department;

    void getStaffDetails(int staffId, String department) {
        this.staffId = staffId;
        this.department = department;
    }

    void displayStaffDetails() {
        System.out.println("Staff ID   : " + staffId);
        System.out.println("Department : " + department);
    }
}

public class Main1 {

    public static void main(String[] args) {

        Student s = new Student();

        s.getPersonDetails("Rahul", 20);
        s.getStudentDetails(101, "Computer Science");

        System.out.println("===== Student Details =====");
        s.displayPersonDetails();
        s.displayStudentDetails();

        System.out.println();

        Teacher t = new Teacher();

        t.getPersonDetails("Anita", 35);
        t.getTeacherDetails(201, "Java Programming");

        System.out.println("===== Teacher Details =====");
        t.displayPersonDetails();
        t.displayTeacherDetails();

        System.out.println();

        Staff st = new Staff();

        st.getPersonDetails("Ramesh", 40);
        st.getStaffDetails(301, "Administration");

        System.out.println("===== Staff Details =====");
        st.displayPersonDetails();
        st.displayStaffDetails();
    }
}

/*
Output:
===== Student Details =====
Name : Rahul
Age  : 20
Roll No : 101
Course  : Computer Science

===== Teacher Details =====
Name : Anita
Age  : 35
Teacher ID : 201
Subject    : Java Programming

===== Staff Details =====
Name : Ramesh
Age  : 40
Staff ID   : 301
Department : Administration
*/
