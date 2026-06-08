import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = sc.nextInt();
        int arr[] = new int[3];
        for(int j=0; j<n; j++){
            int count = 0;
            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1){
                    count++;
                }
            }
            if(count >= 2){
                a++;
            }   
        }
        System.out.println(a);
        sc.close();
    }
}
