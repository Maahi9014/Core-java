import java.util.ArrayList;

public class Merge_sort {
    static ArrayList<Integer> al=new ArrayList<>();
    public static ArrayList<Integer> merg(int a[], int low, int mid, int high ){
        int right=mid+1;
        while(low<mid&&right<high)
                if(a[low]<=a[mid+1]){
                    al.add(a[low]);
                }
        else {
            al.add(a[high]);
                }
        return al;
    }
    public static void mergsort(int a[],int low,int high){
        int mid=low+high/2;
        if(low>=mid){
            return ;
        }
        mergsort(a,low,mid);
        mergsort(a,mid+1,high);
        merg(a,low,mid,high);
    }
    public static void main(String[] args){
//       ArrayList<Integer> al=new ArrayList<>();
        int a[]={1,2,5,0,9};
        mergsort(a,0, a.length);
        for (int i:al){
            System.out.println(i);
        }
    }
}
