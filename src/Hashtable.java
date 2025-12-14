import java.util.Arrays;
import java.util.Map;

public class Hashtable {
//   static int a[]={1,2,3};
//   static int b[]={2,4,5,1,3};
//   Map<Integer,Integer> mp=new java.util.Hashtable<>();
    public static void main(String[] args){
        Map<Integer,Integer> mp=new java.util.Hashtable<>();
        Hashtable h=new Hashtable();
         int a[]={1,2,3};
         int b[]={2,4,5,1,3};
        for(int i=0;i<b.length;i++){
            mp.put(b[i],i);
        }
        System.out.println(mp);
        System.out.println(mp.get(a[2]));
        System.out.println(mp.keySet());
        int x[]=mp.keySet().stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(x));
    }
}
