import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int k=0;k<a;k++){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
        long count = 0;
        int[] freq = new int[2*n];
        
        for(int i=0;i<n;i++){
            int val = arr[i] - i + n;
            if(val >= 0 && val < 2*n){
                count += freq[val];
                freq[val]++;
            }
        }
        System.out.println(count);
        }
        sc.close();
    }}
    

