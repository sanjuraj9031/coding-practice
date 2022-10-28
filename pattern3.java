import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=sc.nextInt();

        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                int min = i < j ? i : j;   
                System.out.print(n - min + 1+ " ");
            }
            for(int j=n-1;j>=1;j--){
                
                int min = i < j ? i : j;   
                System.out.print(n - min + 1+ " "); 
            }
            System.out.println();
        }
        for (int i = n ; i >= 1; i--){
            for (int j = 1; j <= n; j++){
                int min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            for (int j = n - 1; j >= 1; j--){
                int min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            System.out.println();
        }   
        sc.close();
    }
}
