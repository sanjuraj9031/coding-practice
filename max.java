public class max {
    public static void main(String args[])
    {
        int A[]={1,5,6,7,9,15,14,12,18,13};
        int max=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println(max);
    }
}
