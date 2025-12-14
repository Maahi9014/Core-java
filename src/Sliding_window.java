public class Sliding_window {
    int k=3;
   static int arr[]={1,2,4,5,6,7,8,9};
    int maxsum=0;
    public int getMaxsum(int arr[]){
        int sum=0;
        for (int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        sum=maxsum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]=arr[i-k];
        }
        sum=Math.max(sum,maxsum);
        return sum;
    }
    public static void main(String[] args){
        Sliding_window sw=new Sliding_window();
        System.out.println(sw.getMaxsum(arr));

    }
}
