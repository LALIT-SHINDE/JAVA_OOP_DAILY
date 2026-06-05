class Student {

    private int rollNo;
    private String name;
    private int age;
    private double marks;

    public Student() {
        rollNo = 0;
        name = "Unknown";
        age = 0;
        marks = 0.0;
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + getGrade());
        System.out.println();
    }
}

public class Main2{

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setRollNo(101);
        s1.setName("Siddharth");
        s1.setAge(20);
        s1.setMarks(88.5);

        s1.displayDetails();

        Student s2 = new Student();

        s2.setRollNo(102);
        s2.setName("Rahul");
        s2.setAge(21);
        s2.setMarks(95.0);

        s2.displayDetails();

        System.out.println("Accessing data using getters");
        System.out.println("Name  : " + s1.getName());
        System.out.println("Marks : " + s1.getMarks());

        s1.setMarks(92.0);

        System.out.println();
        System.out.println("After updating marks");
        System.out.println("Name  : " + s1.getName());
        System.out.println("Marks : " + s1.getMarks());
        System.out.println("Grade : " + s1.getGrade());
    }
}
/*
output: 
*/
