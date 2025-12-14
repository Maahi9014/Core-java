public class StringBuilder {
    public StringBuilder(String substring) {
    }

    public static void main(String[] args){
        java.lang.StringBuilder sb=new java.lang.StringBuilder();
        String a[]={"sai","mahesh","prasad"};
        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
        }
        System.out.println(sb);
        sb.delete(0,a[0].length());
        System.out.println(sb);
    }
}
