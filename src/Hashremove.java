import java.util.*;
public class Hashremove {
    public static void main(String[] args){
        HashMap<Character,Integer> ht=new HashMap<>();
        String s="lgfoabgf";
        int i=0;
        while(i<s.length()){
            if(ht.containsKey(s.charAt(i))){
                ht.put(s.charAt(i),ht.get(s.charAt(i)));
            }
            else{
                ht.put(s.charAt(i),1);
            }
            i++;
        }
        System.out.println(ht.size());
        ht.clear();
        System.out.println(ht.size());
    }
}
