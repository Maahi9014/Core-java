public class Substring {
    public static void main(String[] args){
        int count=0;
        int s1=0;
        String s="1234";
        int n=s.length();
        for(int i=0;i<n;i++){
            int t=s.charAt(i)-'0';
            int res=s1*10+t;
            if(t%2==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}