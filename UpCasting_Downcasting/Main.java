package UpCasting_Downcasting;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        Dog d = (Dog) a; // downcasting
        d.bark();

    }
}

class Animal{
    void bark(){
        System.out.println("Animal is barking.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }

    void run(){
        System.out.println("Dog is running.");
    }
}

class Cat extends Animal{
    void bark(){
        System.out.println("Cat is meowing.");
    }
}
