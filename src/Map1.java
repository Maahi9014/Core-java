
//=========================================Syntax=================================================
///                                                       Map<genric> m=new class<>();

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
//        Map<Integer,Integer> h=new HashMap<>();
//        h.put(1,2);
//        h.put(1,3);
//        h.put(2,3);
//        h.put(2,3);
        // Syntax for creating a map is
        //  Map< object Type, object Typevalue> reference=new Implementationclass<>();
        // 1.we can add the elements to the map using put() method;
        // 2.we can access the elements using the get() method;
        // 3.we can remove the method using the remove() method;

//==============================================To iterate through the values of the map ===================================================================
//                                              1.using entrySet();  -> for iterating throught the key->value pairs
//                                              2.keySet();        -> for iterating throught the key
//                                              3.valuse();        -> for iterating through the values
//        h.entrySet().forEach(System.out::println);
        ;
//         for (Integer h2:h.keySet()){
//             System.out.println(h2);
//         }
//         for (int h3: h.values()){
//             System.out.println(h3);
//         }
//    }
//}


//Methods used in map

//    1.put() used to add the elements to the map;
//    2.get() used to get the elements of the map;
//    3.remove() used to remove the key values pairs of the map;
//    4.keySet() return a set of all keys
//    5.values() return a collection of all values;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 2);
        mp.put(2, 3);
        System.out.println(mp);
        System.out.println(mp.get(2));
        mp.remove(1);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}