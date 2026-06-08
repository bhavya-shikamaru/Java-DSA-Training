import java.util.*;
public class NewYearGarland{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int m=0;
            for(int i =0;i<a;i++){
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();

                if(r>g && r>b){
                    m=r;
                }
                else if(g>r && g>b){
                    m=g;
                }
                else{
                    m=b;
                }

                int s = r+g+b-m;
                if(m<=s+1){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }

            sc.close();

            
        }
}