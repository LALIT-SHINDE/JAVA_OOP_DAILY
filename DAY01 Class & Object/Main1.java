class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void increaseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departmentName;
    private Employee employee;

    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    public void showDepartmentInfo() {
        System.out.println("\nDepartment: " + departmentName);
        employee.displayDetails();
    }
}

public class Main1{
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Siddharth", 50000);
        Employee emp2 = new Employee(102, "Rahul", 60000);

        System.out.println("Before Salary Increment");
        emp1.displayDetails();

        emp1.increaseSalary(10);

        System.out.println("\nAfter Salary Increment");
        emp1.displayDetails();

        Department dept1 = new Department("IT", emp1);
        Department dept2 = new Department("HR", emp2);

        dept1.showDepartmentInfo();
        dept2.showDepartmentInfo();

        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println("\nHighest Paid Employee: " + emp1.getName());
        } else {
            System.out.println("\nHighest Paid Employee: " + emp2.getName());
        }
    }
}
/*
OUTPUT: 
Before Salary Increment
Employee ID: 101
Employee Name: Siddharth
Salary: 50000.0

After Salary Increment
Employee ID: 101
Employee Name: Siddharth
Salary: 55000.0

Department: IT
Employee ID: 101
Employee Name: Siddharth
Salary: 55000.0

Department: HR
Employee ID: 102
Employee Name: Rahul
Salary: 60000.0

Highest Paid Employee: Rahul
*/
