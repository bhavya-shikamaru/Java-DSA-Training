interface Dog{
    void sound();
}
interface Cat{
    void sound();
}
class Puppy implements Cat, Dog{
    @Override
    public void sound(){
        System.out.println("The Puppy makes a sound");
    }
}
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.sound();
    }
}
