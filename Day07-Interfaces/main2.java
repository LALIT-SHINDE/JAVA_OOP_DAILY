interface EmployeeOperations {
    void addEmployee();
    void removeEmployee();
    void displayEmployee();

    default void welcomeMessage() {
        System.out.println("Welcome to Employee Management System");
    }

    static void companyPolicy() {
        System.out.println("Follow company rules and regulations.");
    }
}

interface SalaryOperations {
    void calculateSalary();

    default void bonusPolicy() {
        System.out.println("Bonus depends on performance.");
    }
}

interface AttendanceOperations {
    void markAttendance();
}

interface ManagementOperations extends EmployeeOperations, SalaryOperations {
    void generateReport();
}

@FunctionalInterface
interface NotificationService {
    void sendNotification(String message);
}

class Employee implements ManagementOperations, AttendanceOperations {

    protected int id;
    protected String name;
    protected double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void addEmployee() {
        System.out.println(name + " added successfully.");
    }

    @Override
    public void removeEmployee() {
        System.out.println(name + " removed successfully.");
    }

    @Override
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Monthly Salary: " + salary);
    }

    @Override
    public void generateReport() {
        System.out.println("Employee report generated.");
    }

    @Override
    public void markAttendance() {
        System.out.println(name + " attendance marked.");
    }
}

class Manager extends Employee {

    private int teamSize;

    Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void generateReport() {
        System.out.println("Manager report generated.");
        System.out.println("Team Size: " + teamSize);
    }

    public void conductMeeting() {
        System.out.println("Manager conducting meeting.");
    }
}

class Developer extends Employee {

    private String technology;

    Developer(int id, String name, double salary, String technology) {
        super(id, name, salary);
        this.technology = technology;
    }

    @Override
    public void calculateSalary() {
        double bonus = salary * 0.10;
        System.out.println("Developer Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }

    public void writeCode() {
        System.out.println(name + " is coding in " + technology);
    }
}

class Tester extends Employee {

    private String testingTool;

    Tester(int id, String name, double salary, String testingTool) {
        super(id, name, salary);
        this.testingTool = testingTool;
    }

    public void testApplication() {
        System.out.println(name + " testing using " + testingTool);
    }
}

class HR extends Employee {

    HR(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void recruitEmployee() {
        System.out.println("HR is recruiting employees.");
    }
}

public class Main2 {

    public static void main(String[] args) {

        EmployeeOperations.companyPolicy();

        Employee emp =
                new Employee(101, "Rahul", 30000);

        emp.welcomeMessage();
        emp.addEmployee();
        emp.displayEmployee();
        emp.calculateSalary();
        emp.markAttendance();
        emp.generateReport();
        emp.bonusPolicy();

        System.out.println("--------------------------------");

        Manager manager =
                new Manager(102, "Amit", 70000, 10);

        manager.addEmployee();
        manager.displayEmployee();
        manager.calculateSalary();
        manager.generateReport();
        manager.conductMeeting();

        System.out.println("--------------------------------");

        Developer developer =
                new Developer(103, "Siddharth",
                        50000, "Java");

        developer.displayEmployee();
        developer.calculateSalary();
        developer.writeCode();

        System.out.println("--------------------------------");

        Tester tester =
                new Tester(104, "Rohan",
                        40000, "Selenium");

        tester.displayEmployee();
        tester.calculateSalary();
        tester.testApplication();

        System.out.println("--------------------------------");

        HR hr =
                new HR(105, "Priya", 45000);

        hr.displayEmployee();
        hr.calculateSalary();
        hr.recruitEmployee();

        System.out.println("--------------------------------");

        Employee[] employees = {
                manager,
                developer,
                tester,
                hr
        };

        System.out.println("Polymorphism Example");

        for (Employee e : employees) {
            e.displayEmployee();
            e.calculateSalary();
            System.out.println();
        }

        System.out.println("--------------------------------");

        NotificationService emailService =
                (message) -> {
                    System.out.println(
                            "Email Notification: "
                                    + message);
                };

        emailService.sendNotification(
                "Salary credited successfully.");

        System.out.println("--------------------------------");

        NotificationService smsService =
                (message) -> {
                    System.out.println(
                            "SMS Notification: "
                                    + message);
                };

        smsService.sendNotification(
                "Attendance marked successfully.");

        System.out.println("--------------------------------");

        ManagementOperations operations =
                new Manager(
                        106,
                        "Karan",
                        80000,
                        15);

        operations.addEmployee();
        operations.displayEmployee();
        operations.calculateSalary();
        operations.generateReport();

        System.out.println("--------------------------------");

        AttendanceOperations attendance =
                new Employee(
                        107,
                        "Neha",
                        35000);

        attendance.markAttendance();

        System.out.println("--------------------------------");

        SalaryOperations salaryObj =
                new Developer(
                        108,
                        "Anjali",
                        60000,
                        "Spring Boot");

        salaryObj.calculateSalary();

        System.out.println("--------------------------------");

        EmployeeOperations employeeObj =
                new HR(
                        109,
                        "Vikas",
                        42000);

        employeeObj.addEmployee();
        employeeObj.displayEmployee();
        employeeObj.removeEmployee();

        System.out.println("--------------------------------");

        System.out.println(
                "Program Completed Successfully");
    }
}
/*
OUTPUT: 
*/
