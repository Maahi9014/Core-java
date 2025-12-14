public class Automorphic {
    public static void main(String[] args){
        int n=7;
        int sqr=n*n;
        while (n>0) {
            System.out.println(sqr);
            int lst = n % 10;
            int lst1 = sqr % 10;
            if (lst != lst1) {
                System.out.println(false);
            }
            else {
                System.out.println(true);
            }
            n = n / 10;
            sqr = sqr / 10;
        }
        }
    }

