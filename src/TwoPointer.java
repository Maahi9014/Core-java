class TwoPointer{
    public static void main(String[] aejs){
        int a[]={1,2,3,4,5};
        int start=0;
//        int temp=0;
        int end=a.length-1;
        while(start<end) {
           int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            System.out.println(a[start]);
            start++;
            end--;
        }
    }

}