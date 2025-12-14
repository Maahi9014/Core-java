import java.util.Arrays;

public class Delete {
    int position=0;
    public int findIndex(int arr[],int element){
//          int position=0;
//          int i;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==element){
                position=i;
            }
        }
        return position;
    }
    public void delete(int arr[]){
        int arr1[]=new int[arr.length-1];
//         int index=findIndex( arr,element);
         for(int i=position;i<arr1.length;i++){
             arr1[i]=arr[i+1];
         }
//         Arrays.sort(arr1);
         for (int i=0;i<arr1.length;i++){
             System.out.println(arr1[i]);
         }
        Arrays.sort(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    public static  void main(String[] args){
        int arr[]={1,2,3,4,5,6787,9,6};
        int element=2;
        Delete d=new Delete();
//        d.delete(arr);
        System.out.println(d.findIndex(arr,2));
        d.delete(arr);
    }
}
