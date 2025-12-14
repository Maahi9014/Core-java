

import java.util.*;
import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        if (n % 2 != 0) {
            System.out.println("weird");
        } else {
            if (n > 2 && n < 5) {

                System.out.println("Not weird");
            } else if (n > 6 && n < 20) {
                System.out.println("weird");
            } else if (n >= 20) {
                System.out.println("Not weird");
            }


        }
    }
}









































