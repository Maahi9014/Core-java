import java.util.Arrays;

public class Secondsmallest {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i]=a[a.length-i-1];
        }
        System.out.println(Arrays.toString(b));
    }
}
