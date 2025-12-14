import java.util.*;

import static java.util.Collections.swap;

public class Arrayreverse {
    public  static void reverse(int arr[]){
        int i=0;
        int n= arr.length-1;
      //  int k=arr[n];
        while (i<n) {
           // for(int j=0;j<n;j++){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
             i++;
             n--;

            }
        }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,6,7,7};
        reverse(arr);
      //  for (int i:arr){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }
       // System.out.println(Arrays.toString(arr));
    }
