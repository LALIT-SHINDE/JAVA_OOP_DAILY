class Vehicle{
    void vehicle(){
        System.out.println("This is Vehicle Class");
    }
}

class Car extends Vehicle{
    void car(){
        System.out.println("This is Car Class");
    }
}

class Bike extends Vehicle{
    void bike(){
        System.out.println("This is Bike Class");
    }
}

class SportsCar extends Car{
    void sportsCar(){
        System.out.println("This is Sports Car Class");
    }
}

class Main1{
    public static void main(String args[]){

        SportsCar s = new SportsCar();

        s.vehicle();
        s.car();
        s.sportsCar();

        System.out.println();

        Bike b = new Bike();

        b.vehicle();
        b.bike();
    }
}
/*
Output

This is Vehicle Class
This is Car Class
This is Sports Car Class

This is Vehicle Class
This is Bike Class
Combination of both forms Hybrid Inheritance. 
*/
