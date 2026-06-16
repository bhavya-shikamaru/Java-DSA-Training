class Appliance{
    void turnOn(){
        System.out.println("Appliance is turned on");

    }
}
class Toaster extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Toaster is turned on");
    }
}
public class App {
    public static void main(String[] args) {
        Toaster toaster = new Toaster();
        toaster.turnOn();
    }
}
