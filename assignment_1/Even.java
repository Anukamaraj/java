 import java .util.Scanner;
 public class Even
 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to test");
        int num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
 }