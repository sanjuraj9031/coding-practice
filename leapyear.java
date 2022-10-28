import java.util.Scanner;

public class leapyear {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
 
        System.out.println("Enter the Year");
         int year=sc.nextInt();
         if (year%4==0)
         {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("It is a Leap year");
                }
                else 
                    System.out.println("It is not a Leap year");
            }
            else 
            {
                System.out.println("It is a Leap year");
            }
         }
         else 
         {
            System.out.println("It is not a Leap year");
         }
         sc.close();
    }
}
