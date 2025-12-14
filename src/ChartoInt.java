import java.util.*;
class ChartoInt {
    public static void main(String[] args) {
        int sum=0;
        String s = "-1/2+1/2+1/3";
        String[] s1 = s.split("\\+|\\+");
        for (String i : s1) {
            int re=Integer.parseInt(i);
            System.out.println(re);
        }
    }
}
