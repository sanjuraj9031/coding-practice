import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b and n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();

        System.out.print(a+" "+b+" ");
        for(int i=0; i<n-2; i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        sc.close();
    }
}
