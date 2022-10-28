import java.util.Scanner;

public class pyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=sc.nextInt();
        
        int sp = n - 1; 

        for(int i = 1; i<=n ; i++){ 
            
            
            for(int j = 1; j <= sp; j++){ 
                System.out.print(" ");
            }
            sp--;
            for (int j=1;j<=2*i-1;j++){  
                System.out.print("*");  
                }  
                System.out.println("");  
                }
              //inverted pyramid  
              int n_stars = 2*n-1;
              int n_spaces = 0;
              for(int i = 1; i <= n; i++){
                  for(int k = 0; k < n_spaces; k++){
                      System.out.print(" ");
                  }
                  for(int j = 0; j < n_stars; j++){
                      System.out.print("*");
                  }
                  n_stars -= 2;
                  n_spaces += 1;
                  System.out.println();  
                } 
        sc.close();
    }
}
