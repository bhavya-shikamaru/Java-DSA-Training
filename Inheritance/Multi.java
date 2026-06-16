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
class Puppy extends Dog{
    void sound(){
        System.out.println("Whimpers");
    }
    void cute(){
        System.out.println("This puppy is cute");
    }
}
class Cat extends Animal {
   Cat() {
   }

   void eat() {
      System.out.println("Cat Eats");
   }

   void sound() {
      System.out.println("Meows");
   }
}

public class Multi {
    public static void main(String[] args){
        Dog d = new Dog();
        Puppy p = new Puppy();
        Cat c = new Cat();
        d.eat();
        d.sound();
        p.eat();
        p.sound();
        p.cute();
        c.eat();
        c.sound();
    }

    
}
