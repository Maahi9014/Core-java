import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n = 131;
        int n1 = n;
        int rev = 0;
        while (n > 0) {
            int res1 = n % 10;
            rev = rev * 10 + res1;
            n = n / 10;
        }
        if (rev == n1) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
