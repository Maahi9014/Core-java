public class Insertion {
    public static void main(String[] srgs) {
        int a[] = {1, 2, 3, 4, 5, 6};
        // int n=a.length;
         int k=-4;
         if(k<0) {
             k = k + a.length;
         }
         else {
             k=k%a.length;
         }
        for (int i = 1; i <= k; i++) {
            rotate(a);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void rotate(int a[]) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        }
    }