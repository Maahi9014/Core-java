import java.util.*;
public class Lastdigit {
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        // ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sum+=(int)s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}

