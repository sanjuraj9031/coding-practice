import java.util.Scanner;

public class age {
    public static void main(String args[])
    {
        int age;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();

        if (age>=14 && age<=55)
        {
            System.out.println("You are Young");
        }
        else
        {
            System.out.println("You are not Young");
        }
        sc.close();
    }
}
