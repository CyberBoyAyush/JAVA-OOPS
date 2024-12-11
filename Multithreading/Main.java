package Multithreading;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

//        System.out.println(a.getPriority());
//        a.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(a.getPriority());


        a.start();
        try {
            Thread.sleep(2);
        }
        catch (Exception e){
            System.out.println("CATCHED");
        }
        b.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println("HI..");
            try {
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println("CATCHED");
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println("HELLO..");
            try {
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println("CATCHED");
            }
        }
    }
}

