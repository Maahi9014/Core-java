import java.util.Scanner;

class Functions {
    public static int getsqrt(int x){
        int square=x*x;
        return square;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        for(int x=0;x<=i;x++){
            int sqr=getsqrt(x);
            System.out.println("the square of "+x+ "is:"+sqr);
        }
    }
}