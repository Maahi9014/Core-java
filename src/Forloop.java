import java.util.Scanner;

public class Forloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           double sum=0;
           double sum1=0;
           for(int i=1;i<=n;i++){
               sum=sum-1.0/i;
               sum1=sum1+1.0/i++;
           }
        System.out.println(sum);

    }

}







