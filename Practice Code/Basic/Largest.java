import java.util.*;
class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int a= sc.nextInt();
        System.out.print("Enter the Second number:");
        int b= sc.nextInt();
        System.out.print("Enter the Third number:");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is the Largest.");
        }
        else if(b>a && b>c){
            System.out.print(b+" is the Largest.");
        }
        else{
            System.out.print(c+" is the Largest.");
        }

    }
    
}
