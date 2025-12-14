public class Split {
    public static void main(String[] args){
        String s="devaruppula sai mahesh";
        String[] parts=s.split(" ");
        int n= parts.length;
        System.out.println(parts[n-1]);
    }
}
