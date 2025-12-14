import java.util.HashMap;
import java.util.Map;

public class CountusingMap {
    public static void main(String[] abs){
        Map<Integer,Integer> mp=new HashMap<>();
        int a[]={1,2,4,5,6,7,5,4,5,6,4,3,3,5,6,7};
        for(int i:a){
            if(mp.containsKey(i)) {
                int count = mp.get(i);
                mp.put(i, count + 1);
            }
                else{
                    mp.put(i,1);
                }
            }
        System.out.println(mp);
        System.out.println(mp.get(6));
        }
    }
