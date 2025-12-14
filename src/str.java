import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class str {
    public  static List<Character> getLetter(String s){
        List<Character> c=new ArrayList<>();
        int count=96,count1=96;
        char[] ch=s.toCharArray();
        for(char ch1:ch){
            if(ch1=='*'){
                count++;
            }
            else{
                count1++;
            }
        }
        c.add((char)count);
        c.add((char)count1);
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        str obj=new str();
        System.out.println(obj.getLetter(s));
    }
}
