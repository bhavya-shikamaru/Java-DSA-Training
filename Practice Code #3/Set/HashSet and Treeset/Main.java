import java.util.*;
public class Main {
    public static void main(String[] args){
    Set<String> cars1 = new HashSet<>();
    Set<String> cars2 = new TreeSet<>();
    //To add
    cars1.add("Maruti");
    cars1.add("Toyota");
    cars1.add("Hyundai");
    cars1.add("Kia");

    System.out.println(cars1);
    cars2.add("Maruti");
    cars2.add("Toyota");
    cars2.add("Hyundai");
    cars2.add("Kia");
    System.out.println(cars2);

    //To check value
    if(cars1.contains("Maruti")){
        System.out.println("Yes, It's Present");
    }
    else{
        System.out.println("No, It's not Present");
    }
    if(cars1.contains("Volvo")){
        System.out.println("Yes, It's Present");
    }
    else{
        System.out.println("No, It's not Present");
    }
    //Printing using for-each
    for(String s:cars1){
        System.out.println("Brand: "+ s);
    }

    
    
}}
