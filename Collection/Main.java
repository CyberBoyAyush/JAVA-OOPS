package Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            arr.add(i);
        }

        System.out.println(arr);

        arr.remove(1);

        System.out.println(arr);

        System.out.println(arr.get(7));

        arr.add(4,1);

        System.out.println(arr);
    }
}
