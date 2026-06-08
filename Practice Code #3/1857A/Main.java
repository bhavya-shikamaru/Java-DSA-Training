import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int h = 0; h < n; h++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            
            if (sum % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}