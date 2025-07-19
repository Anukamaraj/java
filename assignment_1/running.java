import java.util.*;
public class running
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] n=new int[5];
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            n[i]=s.nextInt();

        }
        for(int i=1;i<n.length;i++)
        {
        
          sum=n[i]+n[i-1];
          n[i]=sum;
            
        }  
           for(int i:n)
           {
            System.out.println(i);
           }
    }
    
    
          
    
     
}