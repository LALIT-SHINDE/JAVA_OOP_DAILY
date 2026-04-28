
// Interfaces
interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(500);
    }
}
// output:
// Paid 1000.0 using Credit Card
// Paid 500.0 using UPI
