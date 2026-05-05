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
