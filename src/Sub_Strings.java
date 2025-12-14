public class Sub_Strings {
    public static void main(String[] args){
        String s="abc";
        int j=0;
        String s1="";
//        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            s1="";
            for(j=i;j<s.length();j++){
               s1=s.substring(i,j);
            }
//            System.out.println(sb);
//            sb.delete(i,j);
            System.out.print(s1+" ");
        }
    }
}
