import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Integer> n1= new ArrayList<>();
        List<Integer> n2= new ArrayList<>();

        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);
        n1.add(5);
        n1.add(6);
        n1.add(7);
        n1.add(8);

        n2.add(1);
        n2.add(2);
        n2.add(3);
        n2.add(4);
        n2.add(5);
        n2.add(6);



        System.out.println(n1.containsAll(n2));

        n1.retainAll(n2);      
        System.out.println(n1);  
        n1.add(7);
        n1.add(8);
        n1.removeAll(n2);
        System.out.println(n1);
    }
    
}
