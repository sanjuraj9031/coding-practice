import java.util.Scanner;

public class menudriven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in words");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch(option)
        {
            case "ADD": System.out.println("Sum is "+(x+y));
                        break;
            case "SUB": System.out.println("SUB is "+(x-y));
                        break;
            case "MUL": System.out.println("MUL is "+(x*y));
                        break;
            case "DIV": System.out.println("DIV is "+(x/y));
                        break;
            default: System.out.println("Invalid option");
                        break;            
        }
        sc.close();

    }
    
}
