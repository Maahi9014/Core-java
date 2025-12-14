import java.util.Queue;
import java.util.*;

public class Queu {
    public static void main(String[] args){
        Queue<Integer> q=new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.offer(6);
//        System.out.println(q);
        q.peek();
        q.poll();
        System.out.println(q);




    }

}
