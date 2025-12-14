public class Subarray {
    public static void getSubarray(int a[]){
        for(int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args){
        int a[]={1,2,4,5,6,7};
        Subarray st=new Subarray();
        st.getSubarray(a);
    }
}