package Encapsulation;

public class Main {

    static{
        // static block
        // it is executed when the code is compiled
        System.out.println("Static Block 1 call");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p4.setAge(15);
        System.out.println(p4.getAge());
        System.out.println(Person.var); // accessing static var
        // using class Name
//        Person.scientificName = "AYUSH"; // bcz final
        System.out.println(Person.scientificName);
    }

    static{
        // static block
        // it is executed when the code is compiled
        System.out.println("Static Block 2 call");
    }
}
