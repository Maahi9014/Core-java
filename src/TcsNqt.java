import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.*;

public class TcsNqt {
     public  static int a[]={6,7,4,3,5,1,9,2,4,6,4,3,4,5};
     public static List<Integer> count(int a[]){
         ArrayList<Integer> al=new ArrayList<>();
         Hashtable<Integer,Integer> ht=new Hashtable<>();
         int i=0;
        while (i<a.length){
            if(ht.containsKey(a[i])){
                ht.put(a[i],ht.get(a[i])+1);
            }
            else{
                ht.put(a[i],1);
//                al.add(ht.get(a[i]));
            }
            i++;
        }
        for(int j=0;j<a.length;j++){
            al.add(ht.get(a[j]));
        }
         return al;
     }
//     Hashtable<Integer,Integer> ht=new Hashtable<>();
    public static void main(String[] args){
        TcsNqt tn=new TcsNqt();
        System.out.println(tn.count(a));
    }
}
