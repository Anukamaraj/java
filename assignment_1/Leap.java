import java .util.*;
public class Leap
{
    public static void main(String args[])
    {
      System.out.println("enter the year");  
      Scanner r=new Scanner(System.in);
        int year= r.nextInt();
       if(year%4==0)
       {
        System.out.println("the year is leap year");
       }
       else
       {
        System.out.println("the year is not a leap year");
       }
    }
}