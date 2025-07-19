public class SmallthanCurrent
{
    public static void main(String args[])
    {
        int ar[]={7,6,8,9,1,2,1};
        int res[]=Num(ar);
        for(int i=0;i<res.length;i++)
        {
        System.out.println(res[i]);
        }
    }
    static int[] Num(int ar[])
    {
        
        int res[]=new int[ar.length];
        for(int i=0;i<ar.length;i++)
        {
            int count=0;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    count=count+1;
                }
            }
            for(int j=0;j<i;j++)
            {
                if(ar[i]>ar[j])
                {
                    count++;
                }
            }
            res[i]=count;  

                
            }
            return res;
        }
        
   }   
