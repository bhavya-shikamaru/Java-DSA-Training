abstract class Animal{
    abstract void sound();

    public void sleep(){
        System.out.println("The Animal sleeps");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("The Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("The Cat Meows");
    }
}

public class Main {
    public static void main(String[] args){
    Dog d = new Dog();
    Cat c = new Cat();
    d.sound();
    c.sound();
    
}}
