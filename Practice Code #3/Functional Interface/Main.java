import java.util.*;
@FunctionalInterface
interface Calculator{
    int operate(int a, int b);}
        
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int c = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int d = sc.nextInt();        
        Calculator addition = (a,b) -> (a+b);
        System.out.println(addition.operate(c, d));
        Calculator multiply = (a,b)->(a*b);
        System.out.println(multiply.operate(c, d));
        Calculator Subtract = (a,b)->(a-b);
        System.out.println(Subtract.operate(c, d));
        Calculator divide = (a,b)->{
            try{
                return a/b;
            } catch (Exception e){
                System.out.println(e);
                return 0;
            }
        };
        System.out.println(divide.operate(c, d));
        sc.close();

    }

    }
    

