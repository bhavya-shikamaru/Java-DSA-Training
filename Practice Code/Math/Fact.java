import java.util.*;

public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        double f=1;
        for(int i = 1; i<=n;i++){
            f=f*i;
            }
            System.out.println("Factorial of "+n+" is: "+f);
        }
    }

