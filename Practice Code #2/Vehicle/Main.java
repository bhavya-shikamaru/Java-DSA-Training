class Vehicle{
    int wheels=0;
    int speed=0;
    String colour="Default";

   static void brake(){
    System.out.println("Brake applied");
   }
   static void Run(){
    System.out.println("Vehicle is running");
   }
    
}
class car extends Vehicle{
    String model="Default";
    String company="Default";
    int price=0;
    void display(){
        super.brake();
         super.Run();
    }
    static void Run(){
        System.out.println("Car is running");
    }
}
class Main{
    public static void main(String[] args) {
        car c1 = new car();
        c1.model="Swift";
        c1.company="Maruti";
        c1.price=800000;
        c1.wheels=4;
        c1.speed=200;
        c1.colour="Red";

        System.out.println("Model: "+c1.model);
        System.out.println("Company: "+c1.company);
        System.out.println("Price: "+c1.price);
        System.out.println("Wheels: "+c1.wheels);
        System.out.println("Speed: "+c1.speed);
        System.out.println("Colour: "+c1.colour);
        c1.display();

        car.Run();
        car.brake();
    }
}