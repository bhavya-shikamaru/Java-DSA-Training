import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void subset(int[] arr, int i, int n, ArrayList<Integer> temp){

        if(i==n){
            System.out.print(temp);
            return;
        }
        temp.add(arr[i]);
        subset(arr, i+1, n, temp);
        temp.remove(temp.size() - 1);
        subset(arr, i+1, n,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        subset(arr, 0, n,temp);
        sc.close();
    }
    
}
