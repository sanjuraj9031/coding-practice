import java.util.Scanner;

public class armstrongnum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();

        int sum=0;
        int m=n;
        int r;

        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(m==sum)
            System.out.println("The no. is an Armstrong no.");
        else
            System.out.println("The no. is not an Armstrong no.");
        sc.close();
    }
}
