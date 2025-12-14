import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int a[]){
            for(int i=0;i<a.length-1;i++) {
                for (int j = i + 1; j < a.length; j++) {
                    int min = i;
                    if (a[j] <= a[min]) {
                        min = j;
                    }
                        int temp=a[i];
                        a[i]=a[min];
                        a[min]=temp;

                }
            }
               return a;
    }
    public static void main(String[] args){
        SelectionSort ss=new SelectionSort();
        int a[]={2,3,24,5,2,4,4,24,5,4,0,-1,90908,44,904875,646474930,75775};
        System.out.println(Arrays.toString(ss.sort(a)));
    }
}
