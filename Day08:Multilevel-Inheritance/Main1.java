interface Employee {
    void showEmployeeDetails();
}

interface Department {
    void showDepartment();
}

interface Salary {
    double calculateSalary();
}

interface Bonus {
    double calculateBonus();
}

interface Performance {
    void evaluatePerformance();
}

class SoftwareEngineer implements Employee, Department, Salary, Bonus, Performance {

    private int empId;
    private String name;
    private String department;
    private double basicSalary;
    private int projectsCompleted;

    public SoftwareEngineer(int empId, String name, String department,
                            double basicSalary, int projectsCompleted) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.projectsCompleted = projectsCompleted;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
    }

    public void showDepartment() {
        System.out.println("Department : " + department);
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public double calculateBonus() {
        return projectsCompleted * 5000;
    }

    public void evaluatePerformance() {
        if (projectsCompleted >= 5) {
            System.out.println("Performance : Excellent");
        } else if (projectsCompleted >= 3) {
            System.out.println("Performance : Good");
        } else {
            System.out.println("Performance : Average");
        }
    }

    public void displayReport() {
        System.out.println("\n===== EMPLOYEE REPORT =====");
        showEmployeeDetails();
        showDepartment();

        double salary = calculateSalary();
        double bonus = calculateBonus();

        System.out.println("Basic Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + (salary + bonus));

        evaluatePerformance();
    }
}

public class Main1 {
    public static void main(String[] args) {

        SoftwareEngineer emp1 =
                new SoftwareEngineer(
                        101,
                        "Siddharth",
                        "Software Development",
                        60000,
                        6);

        emp1.displayReport();
    }
}
/*
OUTPUT:
===== EMPLOYEE REPORT =====
Employee ID : 101
Employee Name : Siddharth
Department : Software Development
Basic Salary : 60000.0
Bonus : 30000.0
Total Salary : 90000.0
Performance : Excellent
*/
