import java.util.*;
public class String_operations {
    public static void main(String[] args){
        String s="saimahesh";
        System.out.println(s.length());
        String s1="saiprasad";
        System.out.println(s.equals(s1));
        System.out.println(s.charAt(5));
        System.out.println(s.indexOf('p'));
        String s3=s+s1;
        System.out.println(s3);
        System.out.println(s.substring(0,2));

    }
}
