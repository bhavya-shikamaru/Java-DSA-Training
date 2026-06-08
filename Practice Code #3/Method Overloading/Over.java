class calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
class advancedCalculator extends calculator{
    @Override
    int add(int a, int b){
        return a+b+10;
    }

}
public class Over {
    public static void main(String[] args){
        calculator c = new calculator();
        advancedCalculator ac = new advancedCalculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
        System.out.println(ac.add(2,10));

    
    }
}
