public class Stack {
    public static int a[]=new int[5];
    public static int top=-1;
    public static int size=0;
    public static int[] push(int x){
        if(top==-1){
//            top=top+1;
            a[++top]=x;
//            top=top+1;
        }
        else if(top==a.length-1){
            System.out.println("stack overflow");
        }
        else{
//            top=top+1;
            a[++top]=x;
//            top=top+1;
        }
        size++;
        return a;
    }
    public static int pop() {
        if (top == -1) {
            System.out.println("stack underflow error");
            return -1;
        } else {
            size--;
            return a[top--];
        }
    }
    public static int peek(int a[]){
        return a[top];
    }
    public static void main(String[] atgs){
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st.pop());
        for (int i:a){
            System.out.println(i);
        }
//        System.out.println(st.size);
//        System.out.println(st.pop(a));
//        System.out.println(st.peek(a));
//        System.out.println(st.size);
    }
}