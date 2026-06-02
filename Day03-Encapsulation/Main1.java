// Java Program to Demonstrate Encapsulation
class Employee {

    // Private data members
    private int empId;
    private String empName;
    private String department;
    private double salary;

    // Setter method for Employee ID
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter method for Employee ID
    public int getEmpId() {
        return empId;
    }

    // Setter method for Employee Name
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter method for Employee Name
    public String getEmpName() {
        return empName;
    }

    // Setter method for Department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter method for Department
    public String getDepartment() {
        return department;
    }

    // Setter method for Salary
    public void setSalary(double salary) {

        // Validation
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    // Getter method for Salary
    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double amount) {

        if (amount > 0) {
            salary = salary + amount;
            System.out.println("Salary Increased");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {

        System.out.println("----------- Employee Details -----------");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Department       : " + department);
        System.out.println("Employee Salary  : " + salary);
        System.out.println("----------------------------------------");
    }
}

// Main Class
public class Main1 {

    public static void main(String[] args) {

        // Creating Employee Object
        Employee emp1 = new Employee();

        // Setting values using setter methods
        emp1.setEmpId(101);
        emp1.setEmpName("Siddharth");
        emp1.setDepartment("Computer Science");
        emp1.setSalary(50000);

        // Displaying employee details
        emp1.displayEmployeeDetails();

        // Increasing salary
        emp1.increaseSalary(5000);

        // Display updated salary
        System.out.println("Updated Salary : " + emp1.getSalary());

        // Accessing data using getter methods
        System.out.println("Employee Name : " + emp1.getEmpName());
        System.out.println("Department    : " + emp1.getDepartment());

        // Creating another object
        Employee emp2 = new Employee();

        emp2.setEmpId(102);
        emp2.setEmpName("Rahul");
        emp2.setDepartment("Information Technology");
        emp2.setSalary(45000);

        emp2.displayEmployeeDetails();
    }
}
/*
Output:
----------- Employee Details -----------
Employee ID      : 101
Employee Name    : Siddharth
Department       : Computer Science
Employee Salary  : 50000.0
----------------------------------------

Salary Increased

Updated Salary : 55000.0
Employee Name : Siddharth
Department    : Computer Science

----------- Employee Details -----------
Employee ID      : 102
Employee Name    : Rahul
Department       : Information Technology
Employee Salary  : 45000.0
----------------------------------------
*/
