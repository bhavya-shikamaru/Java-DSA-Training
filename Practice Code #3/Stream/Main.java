import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6);
        System.out.println("The even numbers are: ");
        
        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(num -> System.out.println(num));
    }
}

