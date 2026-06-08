import java.util.*;
public class Fib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term Index: ");
        int n = sc.nextInt();
        int[] arr= new int [n];
        arr[0]=0;
        arr[1]=1;
        for(int i =2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe "+n+"th Term:" + arr[n-1]);
        sc.close();

        }
    }


