import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        int rev=0;
        int m=n;
        int r;

        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(m==rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");

        sc.close();
    }
}
