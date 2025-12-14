import java.util.Scanner;

public class Palindrome1 {
    public boolean palindrome(int n) {
        int rev=findpalindrome(n);
        if(rev==n){
            return true;
        }
        return false;
    }
    int reverse=0;
    public int findpalindrome(int n){
        while(n>0){

            reverse = reverse * 10 + n%10;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Palindrome1 p=new Palindrome1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(p.palindrome(n)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

