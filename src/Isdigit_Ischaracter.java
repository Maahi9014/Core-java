import java.util.ArrayList;

public class Isdigit_Ischaracter {
    public static void main(String[] args){
        String s1="-05948";
        char ch[]=s1.toCharArray();
        ArrayList<Character> al=new ArrayList<>();
        String s="123gdsjp43";
        int i=0;
        while (i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                al.add(s.charAt(i));
            }
            else if(Character.isLetter(s.charAt(i))){
                break;
            }
            i++;
        }
        System.out.println(al);
        for(int j=0;j<ch.length;j++){
            System.out.println(ch[j]);
        }
    }
}
