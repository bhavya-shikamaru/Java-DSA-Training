import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9'){
            System.out.print("YES");
            break;
        }
        else if(i==0){
            System.out.print("NO");
        }
    }
    sc.close();
}}