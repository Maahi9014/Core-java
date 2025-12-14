public class InsertingintoString {
    public static void main(String[] args){
       int n=2365;
       int n1=n;
       int sum=0;
           int count=0;
           while(n>0){
               int lst=n%10;
               count+=1;
               n=n/10;
           }
        while(n>0){
            int last=n%10;
            sum+=Math.pow(last,count);
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(n1);
       }
    }
