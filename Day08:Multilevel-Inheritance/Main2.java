interface Person {
    void displayPersonalInfo();
}

interface Employee {
    void calculateSalary();
}

interface Attendance {
    void markAttendance();
}

interface Project {
    void assignProject(String projectName);
}

interface Performance {
    void evaluatePerformance();
}

class SoftwareEngineer implements Person, Employee,
                                   Attendance, Project, Performance {

    private int empId;
    private String name;
    private String department;
    private double basicSalary;
    private int attendanceDays;
    private int completedProjects;
    private String projectName;

    public SoftwareEngineer(int empId, String name,
                            String department,
                            double basicSalary,
                            int attendanceDays,
                            int completedProjects) {

        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.attendanceDays = attendanceDays;
        this.completedProjects = completedProjects;
    }

    public void displayPersonalInfo() {
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + name);
        System.out.println("Department       : " + department);
    }

    public void markAttendance() {
        System.out.println("Attendance Days  : " + attendanceDays);
    }

    public void assignProject(String projectName) {
        this.projectName = projectName;
        System.out.println("Assigned Project : " + projectName);
    }

    public void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double bonus = completedProjects * 3000;

        double totalSalary = basicSalary + hra + da + bonus;

        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA              : " + hra);
        System.out.println("DA               : " + da);
        System.out.println("Bonus            : " + bonus);
        System.out.println("Total Salary     : " + totalSalary);
    }

    public void evaluatePerformance() {

        System.out.println("Completed Projects : "
                            + completedProjects);

        if (completedProjects >= 8) {
            System.out.println("Performance : Outstanding");
        }
        else if (completedProjects >= 5) {
            System.out.println("Performance : Excellent");
        }
        else if (completedProjects >= 3) {
            System.out.println("Performance : Good");
        }
        else {
            System.out.println("Performance : Average");
        }
    }

    public void generateReport() {

        System.out.println("\n==============================");
        System.out.println(" EMPLOYEE MANAGEMENT REPORT ");
        System.out.println("==============================");

        displayPersonalInfo();
        markAttendance();

        if (projectName != null) {
            System.out.println("Current Project : " + projectName);
        }

        calculateSalary();
        evaluatePerformance();

        System.out.println("==============================");
    }
}

public class MultipleInterfaceManagementSystem {

    public static void main(String[] args) {

        SoftwareEngineer emp1 =
                new SoftwareEngineer(
                        101,
                        "Siddharth",
                        "Development",
                        50000,
                        25,
                        7);

        emp1.assignProject("Online Banking System");
        emp1.generateReport();

        SoftwareEngineer emp2 =
                new SoftwareEngineer(
                        102,
                        "Rahul",
                        "Testing",
                        45000,
                        22,
                        3);

        emp2.assignProject("E-Commerce Website");
        emp2.generateReport();
    }
}
