public class e
{
    public static void main(String args[])
    {
        int num=6;
        flag=false;
        for(int i=2;i<7;i++)
        {
            if(num%i==0)
            {
                System.out.println("the num is prime");
                flag=true;
                break;
            }
            
        }
        if(flag==False)
        {
        System.out.println("not prime");
        }
        
    }
}