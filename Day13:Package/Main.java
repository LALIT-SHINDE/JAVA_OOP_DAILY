/* 
Java program to calculate salary using packages. Creates a package employee and create a class Emp.
Data members are name, employee id, category, basic pay, HRA, DA, net pay, provident fund, gross pay, income tax, 
and allowance. Calculate the values in methods. 
Call the methods to perform and print values. teach me each conspect to sovle this problem.
*/
package Day13;
import java.util.Scanner;

class Emp{
    String Name, category;
    int id;
    double basicPay, HRA, DA, netPay, PF, IncomeTax, GrossPay, allowance;

    void getData(){
        System.out.println("Id: "+id +
                           "\nName: "+ Name +
                           "\nCategory:"+category+
                           "\nBasic Pay: "+basicPay);
    }

    void Cal(){
        HRA = basicPay * 0.20;
        DA = basicPay * 0.10;
        allowance = basicPay * 0.05;
        PF = basicPay * 0.12;
        IncomeTax = basicPay * 0.08;

        GrossPay = basicPay + HRA + DA + allowance;

        netPay = GrossPay - (PF + IncomeTax);
    }

    void Display(){
        System.out.println("HRA: "+HRA+"\nDA: "+ DA+"\nAllowance: "+allowance+"\nPF: "+PF+"\nIncome TAX: "
                           +IncomeTax+"\nGross Pay: "+GrossPay+"\nNet Pay: "+netPay);
    }
}

class Main{
    public static void main(String args[]){
        Scanner o = new Scanner(System.in);
        Emp j = new Emp();

        System.out.print("Enter Name: ");
        j.Name = o.nextLine();

        System.out.print("Enter Category: ");
        j.category = o.nextLine();

        System.out.print("Enter Id: ");
        j.id = o.nextInt();

        System.out.print("Basic PAY: ");
        j.basicPay = o.nextDouble();

        j.getData();
        j.Cal();
        j.Display();
    }
}

/* 
OutPut:
Enter Name: lalit
Enter Category: hype
Enter Id: 12
Basic PAY: 32000
Id: 12
Name: lalit
Category:hype
Basic Pay: 32000.0
HRA: 6400.0
DA: 3200.0
Allowance: 1600.0
PF: 3840.0
Income TAX: 2560.0
Gross Pay: 43200.0
Net Pay: 36800.0
 */

