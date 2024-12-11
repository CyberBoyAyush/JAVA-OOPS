package OOPS_1;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet o1 = new Greet();
        o1.greeting();
        o1.greeting("Ayush");
    }
}

class Greet{
    void greeting(){
        System.out.println("Hello, Good Morning");
    }

    void greeting(String name){
        System.out.println("Hello " + name + " , Good Morning");
    }
}
