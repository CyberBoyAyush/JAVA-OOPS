package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.wheelCnt);
        c1.wheelCnt = 4; // parent class property
        c1.carName = "AMG"; // self property
        c1.year = 2021;
        System.out.println(c1.wheelCnt);
//        c1.start();
    }
}

// Vehicle class as parent
class Vehicle{
    int wheelCnt;

    int year;

    Vehicle(){
        System.out.println("Vehicle obj has created");
    }

    Vehicle(int wheelCnt){
        System.out.println("Vehicle obj with wheelCnt has created.");
        this.wheelCnt = wheelCnt;
    }

    void start(){ // method override
        System.out.println(this);
        System.out.println("Vehicle has started.");
    }
}

// Child classes -> extends
class Car extends Vehicle{
    String carName;

    Car(){
        super(6); // we are calling constructor (parametrized) of Vehicle class (parent)
        System.out.println("car obj has created.");
    }

    void start(){ // method override
        super.start();// invoked parent class start method
        System.out.println(this);
        System.out.println(this.carName + " Car has started. Which has model number of " + this.year);
    }
}
