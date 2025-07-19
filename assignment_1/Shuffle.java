import java.util.*;
public class Shuffle
{
    public static void main(String args[])
    {
       System.out.println("enter the array elements of even number array");
       Scanner s=new Scanner(System.in);
       int a[]=new int[6];
       for (int i=0;i<a.length;i++)
       {
        a[i]=s.nextInt();
       }
       int n=a.length/2;
       int shuffle[]=new int[a.length];
       int index=0;
       for (int i=0;i<n;i++)
       {
        shuffle[index]=a[i];
        shuffle[index+1]=a[i+n];
        index+=2;
       }
       System.out.println(Arrays.toString(shuffle));
       s.close();
    }
}