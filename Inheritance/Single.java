class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog Eats");
    }
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat Eats");
    }
    void sound(){
        System.out.println("Meows");
    }
}
public class Single {
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.sound();
        c.eat();
        c.sound();
    }

    
}
