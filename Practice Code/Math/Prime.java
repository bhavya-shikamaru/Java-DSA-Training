import java.util.*;
class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        boolean b=true;
        if(a<=1){
            System.out.print("The number is not prime.");
        }
        else{
            for(int i=2; i<a; i++){
            int v=0;
            v=a%i;
            if(v==0){
                System.out.print("The number is not prime.");
                b=false;
                break;}
            
            else
                continue;
            }
            if(b){
                System.out.print("The number is prime.");
            }
            }
        }
    }
