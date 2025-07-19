public class rich {
    public static void main(String args[]) {
    int max=Integer.MIN_VALUE;
    
        int a[][] = {{1, 2}, {2, 5}, {5, 6}};
        for (int i = 0; i < a.length; i++) {
            int rowsum=0;
            for (int j = 0; j < a[i].length; j++) {
                 rowsum+=a[i][j];
        if(rowsum>max)
        {
            max=rowsum;
        }

            }
        }
                System.out.println(max);
        

        
    }
}
