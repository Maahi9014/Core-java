import java.util.Arrays;

public class Hash_array {
    static int[] ha1 = new int[256];
//    private int length;

    public void hashMap(char arr[]) {
//        int[] ha=new int[256];
        for (int i : arr) {
            ha1[i] +=1;
        }
    }

    public static void main(String[] args) {
        Hash_array ha = new Hash_array();
        char a[] = {'a', 'z', 'a', 'b', 'b', 'a', 'b', 'c','c'};
        ha.hashMap(a);
        Arrays.sort(ha1);
        for (int i = 0; i < ha1.length; i++) {
            if (ha1[i] > 0) {
                System.out.println(ha1[4]);
            }
        }
    }
}
