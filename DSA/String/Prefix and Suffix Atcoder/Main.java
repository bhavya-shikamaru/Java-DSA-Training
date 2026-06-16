import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        String s = sc.next();
        String p = sc.next();

        if(p.startsWith(s) && p.endsWith(s)){
            System.out.println(0);
        }
        else if(p.startsWith(s)){
            System.out.println(1);
        }
        else if(p.endsWith(s)){
             System.out.println(2);
        }
        else{
            System.out.println(3);
        }
        sc.close();

    }
    
}
