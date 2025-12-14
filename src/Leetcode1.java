public class Leetcode1 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 4, 4, 3, 2, 3, 2, 323, 3, 2, 3, 2, 3, 2, 3, 2};
        int count = 0;
        int count1[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count += i;
                }
                if (count > 2) {
                    count1[i] = count;
                }
            }
        }
        System.out.println(count1);
    }
}
