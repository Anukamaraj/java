import java.util.*;
 public class Larger
 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter two numbers to find largest ");
         int a=obj.nextInt();
         int b=obj.nextInt();
         if(a>b)
         {
          System.out.println("a is larger");
          System.out.println(a);
         }
        else{
          System.out.println("b is larger");
          System.out.println(b);
        }


          
    }
 }