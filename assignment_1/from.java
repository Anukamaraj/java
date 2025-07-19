class from
{
    int a=5;
    int b=10;
    void sum()
    {
        int c=a+b;
        System.out.println(c); 
    }
    void sub()
    {
        int d=a-b;
        System.out.println("sub"+d);
    }
    void pro()
    {
      int f=a*b;
      System.out.println("pro"+f); 
    }
}
class main
{
    public static void main(String args[]);
    from ob=new from();
   
   
    ob.sum();
    ob.sub();
    ob.pro();
}