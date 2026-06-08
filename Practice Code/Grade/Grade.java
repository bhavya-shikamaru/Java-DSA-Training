import java.util.*;
class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int a = sc.nextInt();
        if (a<=30){
            System.out.print("Grade: D");
        }
        else if(a>30 && a<=60){
            System.out.print("Grade: C");
        }
        else if(a>60 && a<=70){
            System.out.print("Grade: B");
        }
        else if(a>70 && a<=90){
            System.out.print("Grade: A");
        }
        else if (a>90 && a<=100){
            System.out.print("Grade: A+");
        }
        else
            System.out.print("Invalid marks.");

}
}