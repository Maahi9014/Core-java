//--------------------------------------------------------------------------------Steps to Implement Recursion-------------------------------------------------------------------------
//      1.  Define the Base Case: The base case is the condition that stops the recursion. This is essential to avoid infinite recursion. It represents the simplest instance of the problem, which can be solved directly.
//
//      2.  Divide the Problem: Break down the problem into smaller sub-problems. In each recursive step, reduce the problem's size by modifying its parameters.
//
//      3.  Recursive Call: Call the function itself with the smaller sub-problems. Ensure that the problem gradually gets smaller and closer to the base case.
//
//      4.  Combine Results (Optional): If the problem is divided into multiple sub-problems, combine their results to solve the larger problem.


// --------------------------------------------------------------------------------->SYNTAX<------------------------------------------------------------------------------------------------


//                                                             function recursiveFunction(parameters){
//                                                                    if (base case condition is met){
//                                                                          return base case result
//                                                                    else
//                                                                    }
//                                      # Break the problem into smaller instances
//                                                                    result = recursiveFunction(modified parameters)
//
//                                       # Combine results if needed
//                                                                    return final result

import java.util.Arrays;

public class Recursion {
    public static int fact(int n){      //printing the factorila usinn the recursion
//        int res=0;
        if((n == 0) || (n == 1)) {
            return 0;

        }
           return n * fact(n - 1);
    }
    public static int reverse(int n){
        if(n==1){
            return 5;
        }
       return reverse(n-1);
    }
// ---------------------------------------------------------------------parametarized and functional recursion--------------------------------------------------------------------------
        public static void parametarized(int n){
            if(n<1)
            {
                System.out.println(0);
            }
            else
            {
                parametarized(n - 1);
                System.out.println(n);
            }
        }
        public static int functional(int n){
            if(n<1){
                return 0;
            }
            return n+functional(n-1);
        }
        public static int reverse(int a[],int n){
             if(n==0){
                 return a[0];
            }
             return reverse(n-1);
        }

         public static int[] reverse(int a[]){
                int start=0;
                int last=a.length-1;
                while (start<last){
//                    int temp=0;
                   int temp=a[start];
                    a[start]=a[last];
                    a[last]=temp;
                    start++;
                    last--;
                }
                return a;
        }
        public static boolean checkPalindrome(int first,int last){
            boolean ch;
        checkPalindrome(first++,last--);
        return true;
        }
            public static void main(String[] args){
                        int a[]={1,2,3,4};
                        char ch[]={'s','a','p','a','s'};
                        Recursion r=new Recursion();
                                        System.out.println(r.fact(5));
                                        System.out.println(r.reverse(5));
                                        System.out.println(r.functional(3));
                                        System.out.println(Arrays.toString(r.reverse(a)));

    }
}