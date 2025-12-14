
import java.util.*;
import java.util.stream.Collectors;
class example1233{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else{
                hm.put(ch[i],1);
            }
        }
        char ch1[]=hm.keySet().stream().map(String::valueOf).collect(Collectors.joining()).toCharArray();
        for(int i=0;i<ch1.length;i++){
            System.out.println(ch1[i]+""+hm.get(ch1[i]));
        }
    }
}