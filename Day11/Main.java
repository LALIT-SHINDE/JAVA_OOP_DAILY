/* 
Java program to calculate salary using packages. Creates a package employee and create a class Emp.
Data members are name, employee id, category, basic pay, HRA, DA, net pay, provident fund, gross pay, income tax, 
and allowance. Calculate the values in methods. 
Call the methods to perform and print values. teach me each conspect to sovle this problem.
*/
package Day11;

public class Main {

    // Data Members
    String name;
    int empId;
    String category;
    double basicPay;

    double hra, da, pf, allowance;
    double grossPay, incomeTax, netPay;

    // Method to assign values
    public void getData(String n, int id, String cat, double bp) {

        name = n;
        empId = id;
        category = cat;
        basicPay = bp;
    }

    // Method to calculate salary
    public void calculateSalary() {

        hra = basicPay * 0.20;
        da = basicPay * 0.10;
        pf = basicPay * 0.12;
        allowance = basicPay * 0.05;

        grossPay = basicPay + hra + da + allowance;

        incomeTax = grossPay * 0.05;

        netPay = grossPay - pf - incomeTax;
    }

    // Method to display details
    public void display() {

        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Category      : " + category);

        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Allowance     : " + allowance);
        System.out.println("PF            : " + pf);

        System.out.println("Gross Pay     : " + grossPay);
        System.out.println("Income Tax    : " + incomeTax);
        System.out.println("Net Pay       : " + netPay);
    }
}
