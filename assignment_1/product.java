import java.util.*;
public class product
{
    public static void main(String args[])
{
    Scanner t=new Scanner(System.in);
    int a=t.nextInt();
    int b=t.nextInt();
    prod(a,b);
}
public static void prod(int a,int b)
{
    System.out.println(a*b);
}
}