public class StackLinkedList {
      StackNode root;
      static class StackNode{
          int data;
          StackNode next;
          StackNode(int data){
              this.data=data;
              this.next=null;
          }
      }
      public StackLinkedList(){
          root =null;
      }
      public void push(int data){
          StackNode st=new StackNode(data);
          st.next=root;
          root=st;
          System.out.println(st.data);
      }
      public int pop(){
          if(root==null){
              System.out.println("stack underflow error");
              return -1;
          }
          else {
              int popvalue=root.data;
              root=root.next;
              return popvalue;
          }
      }
      public int peek(){
          if(root==null){
              System.out.println("satck is empty");
              return -1;
          }
          else{
              return root.data;
          }
      }
      public boolean isEmpty(){
          return root==null;
      }
      public void display(){
          StackNode temp=root;
          int data;
          while(temp.next!=null){
                data=temp.data;
                System.out.println(data);
                temp=temp.next;
          }
//          return data;
      }
    public static void main(String[] args){
        StackLinkedList st=new StackLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.display();
    }
}
