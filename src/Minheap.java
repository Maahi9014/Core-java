import java.util.PriorityQueue;
import java.util.Queue;

public class Minheap {
    static PriorityQueue<Integer> pq=new PriorityQueue<>();
    static int a[]={2,3,1,3,4,3,5,6,7,4};
    public static Queue<Integer> add(int[] a) {
        for (int i : a) {
            pq.add(i);
        }
        return pq;
    }
    public static int min(Queue<Integer> pq){;
            return pq.poll();
    }
    public static void main(String[] args){
        Minheap m=new Minheap();
        System.out.println(m.add(a));
        for (int i=0;i<pq.size();i++) {
            System.out.println(m.min(pq));
        }
    }
}