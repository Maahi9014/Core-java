import java.util.*;
public class SplitMethod {
    public static void main(String[] args){
        String str2="my name is devaruppula saimahesh";
        String str="my name is saimahesh is is is name";
        String s3=str+str2;
        Set<String> s1=new HashSet<>();
        String[] str3=s3.split(" ");
        for (String s:str3){
            s1.add(s);
        }
        System.out.println(s1.toString());
    }
}
