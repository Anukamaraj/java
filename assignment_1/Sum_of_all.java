import java.util.*;
public class Sum_of_all
{
    public static void main(String args[])
    {
        int n;
        int ans=0;
        while(true)
        { 
        System.out.println("enter the number");
        Scanner f=new Scanner(System.in);
         n= f.nextInt();
         if(n==0)
         {
            break;
         }
          ans=ans+n;
        
        }System.out.println(ans);
    }
}