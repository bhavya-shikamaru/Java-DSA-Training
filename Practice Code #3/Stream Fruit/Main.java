import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args){
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry", "Kiwi");
        List<String> aFruits = fruits.stream()
            .filter(fruit -> fruit.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println(fruits);
        System.out.println(aFruits);
    }
    
}


