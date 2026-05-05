package oop;

class Manager extends Employee {
    protected double salary;

    public Manager(String name, String dob, String empId, double salary) {
        super(name, dob, empId);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: ₹" + salary);
    }
}

// SalesManager.java (Leaf Class)
class SalesManager extends Manager {
    private double commission;

    public SalesManager(String name, String dob, String empId, double salary, double commission) {
        super(name, dob, empId, salary);
        this.commission = commission;
    }

}

// Main.java (Driver Class)
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Employee Record ---");
        Employee emp = new Employee("Lalit Shinde", "1990-05-15", "EMP101");
        emp.displayInfo();

        System.out.println("\n--- Sales Manager Record ---");
        SalesManager sm = new SalesManager("Lalit Shinde", "1990-05-15", "SM202", 75000, 5000);
        sm.displayInfo();
    }
}
