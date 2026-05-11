import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter("student.txt");

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            fw.write("Student Name: " + name + "\n");
            fw.write("Roll No: " + roll + "\n");
            fw.write("Marks: " + marks + "\n");

            fw.close();

            System.out.println("\nData Written Successfully\n");

            FileReader fr = new FileReader("student.txt");

            int i;

            System.out.println("Reading File Data:\n");

            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

            fr.close();

        }

        catch(IOException e) {
            System.out.println("File Error");
        }

        sc.close();
    }
}
/* 
Output

Enter Student Name: Siddharth
Enter Roll No: 101
Enter Marks: 85

Data Written Successfully

Reading File Data:

Student Name: Siddharth
Roll No: 101
Marks: 85 
*/
