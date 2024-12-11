package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("Before.");

        try{
            System.out.println(arr[8]);
        }
        catch(Exception e){
            System.out.println("exception handled.");
        }
        finally {
            System.out.println("it will always run.");
        }

        System.out.println("After");

        try {
            System.out.println(getNum(arr));
        }
        catch (Exception e){
            System.out.println("Exception catched " + e.getMessage());
        }

    }

    static int getNum(int arr[]) throws ArrayIndexOutOfBoundsException{
        return arr[100];
    }
}

