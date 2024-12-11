package ExceptionHandling;

import java.util.Scanner;

public class Custom_Exception{
    public static void main(String[] args) throws MyException {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        try {
            if (age > 100) {
                throw new MyException("Custom Error Message");
            }
        } catch (Exception e){
            System.out.println(e + e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
