public class QueueusingArray {
    public static int a[]=new int[3];
    public static int start;
    public static int end;
    public static int size=0;
    public static void push(int x){
        if(start>=size){
            System.out.println("Stack overflow");
        }
        if(size==0){
            start=-1;end=-1;
        }
        else if(size==1){
            start=1;end=1;
        }
        else{
            end=(start+1)%a.length;
        }
        a[start]=x;
        size++;
    }
    public static void main(String[] args){
        QueueusingArray q=new QueueusingArray();
        for (int i:a){
            System.out.println(i);
        }
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
    }
}