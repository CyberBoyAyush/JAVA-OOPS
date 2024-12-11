package Interfaces;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.runs();
        d.walk();
        System.out.println(Animal.legs);
        d.jumps();
    }
}

interface Animal{
    void walk();

    int legs = 4; // this is public static final by default

    // default methods
    default void jumps(){
        System.out.println("Animal is jumping");
    }
}

interface Pet{
    void runs();
}

class Dog implements Animal,Pet{

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void runs() {
        System.out.println("Dog is running.");
    }
}
