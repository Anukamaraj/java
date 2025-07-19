import java.util.*;

public class max_min {
    public staic void main(String args[])
    {
        Scanner s=new scanner(System.in);
        int a=s.nextInt();
        int b=s.nextint();
        int c=s.nextInt();
        max();
        min();
}
public void max
        {
            if(a>b)
            {
                if(a>c)
                {
                     System.out.println("max="+a);
                }
            }
                else
                        {
                            System.out.println(c);
                        }
            else
          {
            System.out.println(b);
          }
        }
public void min
        {

                if(a>b)
                {
                  if(a>c)
                  {
                    System.out.println("min="+a);
  
                  }

                  else
                  {
                        System.out.println(c);
                  }
                }
                else
                {
                    System.out.println(b);

                }
        }
