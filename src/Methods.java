import java.util.Scanner;

/*private class Methods {
    //private methods
     int rollno=23;
     String name="saimahesh";
}
class Methods1{
    public static void main(String[] args){
        //creating an object to the method1 class
        Methods student=new Methods();

        System.out.println(student.rollno);
        System.out.println( student.name);
    }
}*/
 /*public class Methods1{
    private String name;
    //getter method
    public String getName(){)
        return this.name;
    }
    //setter method
    public void  setname(String name)
    {
         this.name=name;
        }
    class Methods{
        public static void main(String[] args){
            Methods student=new Methods();
            //acess the privater class membes to the public class members using setter and gettter methos
             student.setname("saimahesh");
             System.out.println(student.getName());
        }
    }
}*/
//user defined class
public class Methods{
    public static void main(System[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}