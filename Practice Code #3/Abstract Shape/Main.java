import java.util.*;
abstract class Shape{
    abstract void Area();
}
class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void Area(){
        System.out.println("Enter the Radius:");
        double a = sc.nextInt();
        System.out.println("Area: "+3.14*a*a);
    }
}
class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void Area(){
        System.out.println("Enter the length: ");
        double a = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        double b = sc.nextInt();
        System.out.println("Area: "+a*b);
    }
}
public class Main {
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.Area();
        r.Area();


    }
    
}
