import java.util.Arrays;
import java.util.List;

public class Lexicogrsphical {
    public static void main(String[] args){
        int n=13;
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=Integer.toString(i);
//            System.out.println(str[i]);
        }
        Arrays.sort(str);
        for(String s:str){
            System.out.println(s);
        }
//        int[] a=Integer.
//        for (int f:a){
//            System.out.println(f);
//        }

//        System.out.println(str.toString());
    }
}
