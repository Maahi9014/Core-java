import java.lang.ref.SoftReference;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
}
class Linked_list {
    static Node head;
//    Node current = head;

    public void add(int a) {
//        Node current = head;
        Node n = new Node(a);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public void insert_at_beging() {
        if (head == null) {
            Node n = new Node(9);
            head = n;
        } else {
            Node n = new Node(9);
            n.next = head;
            head = n;
        }
    }
    public void insert_at_end(){
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                Node n=new Node(10);
                temp.next=n;
            }
            temp=temp.next;
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

    public class LinkedListt {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5};
            Linked_list l = new Linked_list();
            for (int i = 0; i < arr.length; i++) {
                l.add(arr[i]);
            }
            l.print();
            System.out.println("");
            l.insert_at_beging();
            System.out.println("");
            l.print();
            System.out.println("");
            l.insert_at_end();
        }
    }