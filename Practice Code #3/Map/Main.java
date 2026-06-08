import java.util.*;
public class Main {
    public static void main(String[] args){
        Map<Integer, String> Students =new HashMap<>();
        
        Students.put(12, "Rashi");
        Students.put(13, "Bhavya");
        Students.put(14, "Harshita");
        Students.put(15, "Kashish");
        Students.put(15, "Ayan");

        System.out.println(Students);

        System.out.println(Students.get(12));

        //Iterating a Map
        for(Map.Entry<Integer,String> Student : Students.entrySet()){
            System.out.println(Student.getKey()+" "+Student.getValue());


        }
    }
    
}
