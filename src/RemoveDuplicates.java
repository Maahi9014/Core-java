public class RemoveDuplicates {
    public static void main(String[] args){
        int arr[]={2,2,3,3,4,6,6};
        int rd=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        for (int j=0;j<arr[rd];j++){
            System.out.println(arr[j]);
        }
    }
}
