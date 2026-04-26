// Method Overloading (Compile-Time)
class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println(m.add(5, 3));
        System.out.println(m.add(5, 3, 2));
    }
}
/*
output:
8
10
*/
