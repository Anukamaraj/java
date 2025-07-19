import java.util.*;
import java.util.Arrays;
public class Candies
{
    public static void main(String args[])
    {
     int extracandies=3; 
     int candies[]=new int[5];
     Scanner s=new Scanner (System.in);
     for(int i=0;i<candies.length;i++)
     {
        candies[i]=s.nextInt();
     }
     for(int i=0;i<candies.length;i++)
     {
        System.out.println(candies[i]);
     }
     int res[]=new int[candies.length];
     for(int i=0;i<candies.length;i++)
     {
        res[i]=extracandies+candies[i];
     }
     for(int i=0;i<candies.length;i++)
     {
     System.out.println(res[i]);
     }
     int max=res[0];
     for(int i=1;i<res.length;i++)
     {
        if(res[i]>max)
        {
            max=res[i];
        }
        
     }
     System.out.println(max);
     boolean cand[]=new boolean[candies.length];
     for(int i=0;i<res.length;i++)
     {
          cand[i]=(res[i]>=max);
     }
        
           
     
     
     
        System.out.println(Arrays.toString(cand));
      
     
    }
    
}