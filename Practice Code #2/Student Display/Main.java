class Object {
    static int roll = 105;

    static void display(){
        System.out.println("Roll: "+ roll);
    }
    
}
public class Main{
    public static void main(String[] ars){
        System.out.println(Object.roll);
        Object.display();


    }
}
