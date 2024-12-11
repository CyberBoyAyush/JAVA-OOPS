package Abstraction;

public class Main {
    public static void main(String[] args) {
        Car a = new Car();
        a.accelerate();
        a.brake();
        a.honks();
    }
}

abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();
    void honks(){
        System.out.println("Vehicle Honks.");
    }
}

class Car extends Vehicle{
    @Override
    void accelerate(){
        System.out.println("Car is accelerated.");
    }

    @Override
    void brake(){
        System.out.println("Car brake has applied.");
    }
}
