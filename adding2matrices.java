public class adding2matrices {
    public static void main(String args[])
    {
        int A[][]={{5,3,1},{5,8,7},{4,5,6}};
        int B[][]={{4,6,1},{5,7,3},{1,6,9}};
        int C[][]=new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}