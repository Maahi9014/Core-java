import java.util.Arrays;

class Arrayoperations {

    //insserting at the end of an array//.
   /* public void insertAtEnd(int arr[]){
        int array1[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
             array1[i]=arr[i];
        }
        array1[arr.length]=4;
        for (int i=0;i< array1.length;i++){
            System.out.println(array1[i]);
        }
//        array1[array1.length]=5;
    }
    public static void main(String[] args){
        Arrayoperations ar=new Arrayoperations();
        int arr[]={1,2,3};
        ar.insertAtEnd(arr);
    }*/

    //inserint at a particular position
   /* public void inertAtPosition(int arr[],int positon,int x) {
        int[] arr1 = new int[arr.length + 1];
//          int i=1;
        for (int i = 0; i < arr1.length; i++) {
            if (i < positon) {
                arr1[i] = arr[i];
            } else if (i == positon) {
                arr1[i] = x;
            } else {
                arr1[i] = arr[i-1];
            }
            System.out.println(arr1[i]);
        }
    }
    public static void main(String[] args){
        Arrayoperations a=new Arrayoperations();
        int arr[]={1,2,3,4};
        a.inertAtPosition(arr,3,5);
    }
    }*/


    // program to find the 3 largest numbers//



    /*public void printl3largest(int arr[], int n) {
        int first = 0;
        int second = 0;
        int third = 0;
       /* Arrays.sort(arr);
        for (int i = arr.length-1; i >= arr.length - 3; i--) {
            System.out.print(arr[i] + " ");
        }
    }*/
      /*  for(int i=0;i< arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            } else if (arr[i]>second) {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third) {
                third = arr[i];
            }
            }
        System.out.println(first+" "+second+" "+third+" ");
        }
        public static void main (String[]args){
            int arr[] = {6, 8, 1, 9, 2, 1, 10, 10};
            int n = arr.length;
            Arrayoperations a = new Arrayoperations();
            a.printl3largest(arr, arr.length);
        }*/


    //program to find the missing numbers//
   /* public int findMissingElement(int arr[], int n) {
        Arrays.sort(arr);
//        for (int i=0;i<n;i++) {
//            System.out.println(arr[i]);
//        }
        for (int i =0; i < n + 1; i++) {
            if (arr[i] != i+1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,6,3,7,8};
        int n = arr.length;
        Arrayoperations a = new Arrayoperations();
        System.out.println(a.findMissingElement(arr,n));
    }
}*/
  public int findElement(int arr[],int key) {
      int position;

      int arr1[] = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == key) {
              return i;
          }
      }
      return -1;
  }
    public void delete(int arr[],int key) {
        int arr1[] = new int[arr.length];
        int index = findElement(arr, key);
        for (int i = 0; i < arr.length-1; i++) {
            if (i < index) {
                arr1[i] = arr[i];
            } else if (i == index) {
                arr1[i] = arr[i+1];
            }
            else if(i>index){
                arr1[i]=arr[i+1];
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args){
        Arrayoperations a=new Arrayoperations();
        int arr[]={1,2,3,4,5,6};
        int key=3;
        a.delete(arr,key);
    }
}