import java.util.Scanner;

public class linearsearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={5,6,8,15,19,3,2,1,7};

        int key;
        System.out.println("Enter the key");
        key=sc.nextInt();
        for(int i=0; i<a.length; i++)
        {
            if(key==a[i])
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
        sc.close();
        
    }
}
