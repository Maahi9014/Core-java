import java.util.ArrayList;
import java.util.*;

public class Collections {
    public static void main(String[] arh) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
//        System.out.println(arr);
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
//            System.out.println(arr);
        }
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(9);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(4));
        System.out.println(arr.remove(4));
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains(3));
        System.out.println(arr.indexOf(2));
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(1));

    }
}
