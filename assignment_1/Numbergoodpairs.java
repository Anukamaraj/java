public class Numbergoodpairs{
  public static void main(String args[])
  {
    int arr[]={1,2,3,1,2,3};
    int res=Number(arr);
    System.out.println(res);
  }
  static int Number(int arr[])
  {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]==arr[j])
        {
          count=count+1;
        }
      }
    }
    return count;
  }
}
