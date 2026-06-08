class Person {

    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayPerson() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }
}

// ---------------- STUDENT ----------------

class Student extends Person {

    protected int rollNo;
    protected String course;

    public Student(String name, int age, String gender,
                   int rollNo, String course) {

        super(name, age, gender);

        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayStudent() {

        displayPerson();

        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
    }
}

class Undergraduate extends Student {

    private int semester;

    public Undergraduate(String name, int age, String gender,
                         int rollNo, String course, int semester) {

        super(name, age, gender, rollNo, course);

        this.semester = semester;
    }

    public void display() {

        System.out.println("\n===== Undergraduate Student =====");

        displayStudent();

        System.out.println("Semester : " + semester);
    }
}

class Graduate extends Student {

    private String specialization;

    public Graduate(String name, int age, String gender,
                    int rollNo, String course,
                    String specialization) {

        super(name, age, gender, rollNo, course);

        this.specialization = specialization;
    }

    public void display() {

        System.out.println("\n===== Graduate Student =====");

        displayStudent();

        System.out.println("Specialization : " + specialization);
    }
}

// ---------------- PROFESSOR ----------------

class Professor extends Person {

    protected int empId;
    protected String department;

    public Professor(String name, int age, String gender,
                     int empId, String department) {

        super(name, age, gender);

        this.empId = empId;
        this.department = department;
    }

    public void displayProfessor() {

        displayPerson();

        System.out.println("Employee ID : " + empId);
        System.out.println("Department  : " + department);
    }
}

class HOD extends Professor {

    private int experience;

    public HOD(String name, int age, String gender,
               int empId, String department,
               int experience) {

        super(name, age, gender, empId, department);

        this.experience = experience;
    }

    public void display() {

        System.out.println("\n===== Head Of Department =====");

        displayProfessor();

        System.out.println("Experience : "
                           + experience + " Years");
    }
}

class Lecturer extends Professor {

    private String subject;

    public Lecturer(String name, int age, String gender,
                    int empId, String department,
                    String subject) {

        super(name, age, gender, empId, department);

        this.subject = subject;
    }

    public void display() {

        System.out.println("\n===== Lecturer =====");

        displayProfessor();

        System.out.println("Subject : " + subject);
    }
}

// ---------------- STAFF ----------------

class Staff extends Person {

    protected int staffId;

    public Staff(String name, int age, String gender,
                 int staffId) {

        super(name, age, gender);

        this.staffId = staffId;
    }

    public void displayStaff() {

        displayPerson();

        System.out.println("Staff ID : " + staffId);
    }
}

class Admin extends Staff {

    private String role;

    public Admin(String name, int age, String gender,
                 int staffId, String role) {

        super(name, age, gender, staffId);

        this.role = role;
    }

    public void display() {

        System.out.println("\n===== Administrator =====");

        displayStaff();

        System.out.println("Role : " + role);
    }
}

class Librarian extends Staff {

    private int booksManaged;

    public Librarian(String name, int age, String gender,
                     int staffId, int booksManaged) {

        super(name, age, gender, staffId);

        this.booksManaged = booksManaged;
    }

    public void display() {

        System.out.println("\n===== Librarian =====");

        displayStaff();

        System.out.println("Books Managed : "
                           + booksManaged);
    }
}

// ---------------- MAIN ----------------

public class UniversityManagement {

    public static void main(String[] args) {

        Undergraduate u =
            new Undergraduate(
                "Rahul",
                19,
                "Male",
                101,
                "B.Tech",
                3);

        Graduate g =
            new Graduate(
                "Priya",
                24,
                "Female",
                102,
                "M.Tech",
                "Artificial Intelligence");

        HOD h =
            new HOD(
                "Dr. Sharma",
                50,
                "Male",
                201,
                "Computer Science",
                25);

        Lecturer l =
            new Lecturer(
                "Ms. Anita",
                34,
                "Female",
                202,
                "Computer Science",
                "Java Programming");

        Admin a =
            new Admin(
                "Ramesh",
                40,
                "Male",
                301,
                "Office Manager");

        Librarian lib =
            new Librarian(
                "Suman",
                38,
                "Female",
                302,
                15000);

        u.display();

        g.display();

        h.display();

        l.display();

        a.display();

        lib.display();
    }
}
/*
OUTPUT:
===== Undergraduate Student =====
Name   : Rahul
Age    : 19
Gender : Male
Roll No : 101
Course  : B.Tech
Semester : 3

===== Graduate Student =====
Name   : Priya
Age    : 24
Gender : Female
Roll No : 102
Course  : M.Tech
Specialization : Artificial Intelligence

===== Head Of Department =====
Name   : Dr. Sharma
Age    : 50
Gender : Male
Employee ID : 201
Department  : Computer Science
Experience : 25 Years

===== Lecturer =====
Name   : Ms. Anita
Age    : 34
Gender : Female
Employee ID : 202
Department  : Computer Science
Subject : Java Programming

===== Administrator =====
Name   : Ramesh
Age    : 40
Gender : Male
Staff ID : 301
Role : Office Manager

===== Librarian =====
Name   : Suman
Age    : 38
Gender : Female
Staff ID : 302
Books Managed : 15000
*/
