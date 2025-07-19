import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        System.out.println("enter radius");
      Scanner s=new Scanner(System.in);
      double pi=3.14;
      int r=s.nextInt();
    double area =pi*r*r;
      System.out.println("Area of circle"+area);
    }
}