import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Checkrepeated {
    public static void main(String[] args){
//        int ar[]={4, 5, 2, 3, 5, 1, 21};
//        Map<Integer,Integer> h=new HashMap<>();
//        for(int i:ar){
//            if(h.containsKey(i)){
//                int count=h.get(i);                     for getting the first repeated element;
//                h.put(i,count+1);
//            }
//            else{
//                h.put(i,1);
//            }
//            if(h.get(i)>1){
//                System.out.println(i);
//            }
//        }

        int ar[]={1, 2, 3, 1, 4, 5};
        int count1=-1;
        Map<Integer,Integer> h=new HashMap<>();
        Map<Integer,Integer> h1=new Hashtable<>();
        for(int i:ar){
            count1++;
            if(h.containsKey(i)){
                int count=h.get(i);
                h.put(i,count+1);
            }
            else{
                h.put(i,1);
            }
            if(h.get(i)>1){
//                if()
            }
        }
        System.out.println(h1.put(1,null));
        System.out.println(h.put(4,null));
}
}
