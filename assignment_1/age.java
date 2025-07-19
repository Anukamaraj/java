import java.util.*;
public class age
{
    public static void main(String args[])
    {
        System.out.println("enter your age");
        Scanner r=new Scanner(System.in);
        int age=r.nextInt();
        agee(age);

    }
    public static void agee(int age)
    {
        if(age>=18)
        {
            System.out.println("you're eligible to vote");
        }
        else
        {
         System.out.println("you're not eligible to vote");
        }
    }
}