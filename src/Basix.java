import java.util.Arrays;
import java.util.*;

public class Basix {
    public void selectionsort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static void main(String[] args){
        Scanner ss=new Scanner(System.in);

        int n= ss.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ss.nextInt();
        }
        Basix b=new Basix();
        b.selectionsort(arr,n);
    }
}