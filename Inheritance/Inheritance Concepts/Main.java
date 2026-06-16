class Shape{
    String Colour = "Red";
}
class Circle extends Shape{
    String Colour = "Blue";


    void disp(){
        System.out.println(Colour);
        System.out.println(super.Colour);
    }
}
public class Main {
    public static void main(String[] args){
        Circle c = new Circle();
        c.disp();

    }
    
}
