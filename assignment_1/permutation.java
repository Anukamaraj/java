import java.util.*;
public class permutation
{
    public static void main(String[] args)
    {   
        int[] arr=new int[5];
        int ans[]=new int[arr.length];
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        { 
            if(arr[i]>=0 && arr[i]<arr.length)
            {
            ans[i]=arr[arr[i]];
         
            }
            else
            {
            System.out.println("invalid");
            return;
            }
        }
        for(int i:ans)
        {
            System.out.println(i);
        }
    
    }
}