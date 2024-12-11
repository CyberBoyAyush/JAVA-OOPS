package OOPS_1;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.walk();


        Dog d2 = new Dog();
        d2.name = "LEO";
        d2.bark();

        Complex c1 = new Complex();
        c1.a = 3;
        c1.b = 5;
        c1.print();
    }
}

class Dog{
    String name;
    int age;
    String colour;


    void walk(){
        System.out.println(name + " is walking");
    }
    void bark(){
        System.out.println(name + " is barking");
    }
}

class Complex{
    int a,b;

    void print(){
        System.out.println(a + " + " + b + "i");
    }
}
