public class copyinganarray {
    public static void main(String args[])
    {
        int A[]={5,6,8,9,12,17,18,3,2,12};
        int B[]=new int[10];

        for (int i=A.length-1,j=0 ; i>=0; i--,j++)
        {
            B[j]=A[i];
            System.out.print(B[j]+",");
        }
    }
}
