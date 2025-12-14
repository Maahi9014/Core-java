public class Laregestthreenubers {
    public static void main(String[] args){
        int []a={12,23,45,23,23,4345,23,23,24};
        int temp=a[0];
        int first=0;
        int second=0;
        int third=0;
        for(int i=1;i<a.length;i++){
            if(temp>a[i]){
                third=second;
                second=first;
                first=a[i];
                temp=first;
            }
            else if (a[i]<second&&a[i]>third) {
                third=second;
                second=a[i];
            }
            else if(a[i]<third&&a[i]>second){
                third=a[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
