package Encapsulation;

public class Person {
    private int age;
    private String name;

    public static int var = 0;

    public static final String scientificName = "Homo Sapiens";

    Person(){
        var++; // keeps count of how many obj are created
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
