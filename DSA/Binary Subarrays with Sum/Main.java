import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int j =0;j<n;j++){
            arr[j]=sc.nextInt();
        }

        int sum =0;
        int pref[]= new int[n];
        pref[0]=arr[0];
        for(int i =1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int k=0;k<n;k++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            l-=1;
            r-=1;

            sum = pref[r]-pref[l-1];
        }
        System.out.print(sum);
        sc.close();
    }
    
}
