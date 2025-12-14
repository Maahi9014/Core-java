import java.util.ArrayList;
import java.util.*;
public class Sub_Sequence {
     static  int a[]={3,1,2};
   static ArrayList<Integer> a1=new ArrayList<>();
    public static void subSequence(int index, ArrayList<Integer>a1){
        if(index>=3){
            System.out.println(a1);
            return;
        }
        a1.add(a[index]);
        subSequence(index+1,a1);
        a1.remove(a1.size()-1);
        subSequence(index+1,a1);
    }
    public static void main(String[] args){
        Sub_Sequence sb=new Sub_Sequence();
//        int a[]={3,1,2};
//        ArrayList<Integer> a1=new ArrayList<>();
        sb.subSequence(0, a1);
    }
}
