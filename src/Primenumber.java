public class Primenumber {
    public static void main(String[] args){
        int count=0;
        int n=6;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>2){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
