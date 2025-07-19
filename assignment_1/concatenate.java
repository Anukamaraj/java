import java.util.*;
public class concatenate
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] n= new int[5];
        for(int i=0;i<n.length;i++)
        {
        n[i]=s.nextInt();
        }
        int ans[]=new int[2*n.length];
        for(int i=0;i<n.length;i++)
        {
           ans[i]=n[i];

        }
        int index=n.length;
        for(int i=0;i<n.length;i++)
        {
            ans[index]=n[i];
            index++;

        }
    for(int i:ans)
    {
        System.out.println(i);
    }
    }
}