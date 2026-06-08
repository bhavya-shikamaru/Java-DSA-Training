
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr1[] = new int[a];
        int arr[] = new int[2];
        for(int i=0;i<a;i++){
            for(int j=0;j<2;j++){
                arr[j] = sc.nextInt();
                }
                if(arr[1]%2==0){
                    arr1[i] = 0;
                }
                else{
                    arr1[i] = arr[0];
                    }
            }    
            for(int num:arr1){
                System.out.println(num);
        }
        sc.close();
    }}
              
    
