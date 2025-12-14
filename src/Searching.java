public class Searching {
    public static int binarSearch(int arr[], int x){
        int l=0;
        int r=arr.length-1;
        int m=(l+r)/2;
        while(l<=r){
            if(arr[m]==x)
                return m;
            if(arr[m]<x)
             l=m+1;
            else
                r=m-1;
    }

        return -1;
}
public static void main(String[] args){
      int arr[]={1,2,3};
      int x=2;
    System.out.println(binarSearch(arr,x));

    }
}