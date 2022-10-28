import java.util.Scanner;

public class minimumjumps {

    public static int minJumps(int[] arr){
        int n=arr.length;
        int maxreach=arr[0];
        int step=arr[0];
        int jump=1;
        
        if (n==1)
        return 0;
        
        else if (arr[0]==0)
        return -1;
        else
        for (int i=1;i<n;i++){
            if(i==n-1)
            return jump;
        maxreach=Math.max(maxreach,i+arr[i]);
        step--;
        
        if(step==0){
        jump++;
        if(i>=maxreach)
        return -1;
        step=maxreach-i;
        }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[20];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.print("minimum no. of jumps to reach the end is "+minJumps(arr));
        sc.close();
    }
}
