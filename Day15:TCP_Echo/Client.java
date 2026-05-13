import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket s = new Socket("localhost", 5000);

            // Input and Output streams
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Scanner sc = new Scanner(System.in);

            // Take message from user
            System.out.print("Enter message: ");
            String msg = sc.nextLine();

            // Send message to server
            dos.writeUTF(msg);

            // Receive echo from server
            String response = dis.readUTF();

            System.out.println("Echo from server: " + response);

            // Close connections
            dis.close();
            dos.close();
            s.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
