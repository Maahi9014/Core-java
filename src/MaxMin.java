import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int sum = 0;
        int a[] = {1, 2, 4, 323, 4, 2, 42323, 45354};
       // Arrays.sort(a);
        int key = 2;
        int res = Arrays.binarySearch(a, key);
        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println("not found");
        }
    }
}

