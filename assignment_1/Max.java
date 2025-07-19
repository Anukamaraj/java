 import java.util.*;
 public class Max
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        int temp=Integer.MIN_VALUE;
        ;
        while(true)
        {
            System.out.println("enter number");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
        
            if(n==0)
            {
                break;
            }
            if(n>temp)
            {
                temp=n;
                
    

            }
            else
            {
                System.out.println(temp);
            }
        }System.out.println(temp);
    }
}