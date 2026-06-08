import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            ArrayList<Integer> List = new ArrayList<>();
            int c0 =0;
            int c1 =0;
            int c2 =0;
            int op = 0;
            int a = sc.nextInt();
            for(int j=0; j<a; j++){
             List.add(sc.nextInt());
                 }
                 for(int m: List){
                    if(m == 0){
                        c0++;
                     }
                     if(m == 1){
                        c1++;
                     }
                     if(m == 2){
                        c2++;
                     }
                 }           
            op += c0;
            if(c1 >= c2){
                op += c2;
                c1 -= c2;
                if (c1 >= 3){
                    op += c1/3;
                }
            }
            else if(c2 > c1){
                op += c1;
                c2 -= c1;
                if (c2 >= 3){
                    op += c2/3;
                }
            }
            System.out.println(op);
        }
        sc.close();
    }}

