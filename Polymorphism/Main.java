package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes a = new Shapes();
        Shapes s = new Circle();
        Square b = new Square();
        Circle c = new Circle();

        a.area();
        b.area();
        c.area();
        s.area();

        Calc ch = new Calc();
        System.out.println(ch.add(1,2));
        System.out.println(ch.add(1.0,2.0));
    }
}

class Shapes{
    public void area(){
        System.out.println("Call from Shapes.");
    }
}

class Square extends Shapes{
    public void area(){
        System.out.println("Call from Square.");
    }
}

class Circle extends Shapes{
    public void area(){
        System.out.println("Call from Circle.");
    }
}

class Calc{
    int add (int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}