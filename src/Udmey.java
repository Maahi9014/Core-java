import java.util.Scanner;

public class Udmey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for ( int i = 0; i <= 10; i++) {
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
}
