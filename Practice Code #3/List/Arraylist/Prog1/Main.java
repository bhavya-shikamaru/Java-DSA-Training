import java.util.*;
class Main {
    public static void main(String[] args){
        //Defination
        List<String> CodingLanguages = new ArrayList<>();
        //To add Values
        CodingLanguages.add("Java");
        CodingLanguages.add("Golang");
        CodingLanguages.add("Python");
        CodingLanguages.add("Typescript");      
        //To add at specific index
        CodingLanguages.add(1,"Rust");
        CodingLanguages.add(3,"PHP");  
        //To print Arraylist
        System.out.println(CodingLanguages);
        //To access
        System.out.println(CodingLanguages.get(2));
        //To Update Values
        CodingLanguages.set(2,"C++");
        System.out.println(CodingLanguages);        
        //To remove values
        CodingLanguages.remove(4);
        System.out.println(CodingLanguages);
        //Sort List
        //Collections.sort(CodingLanguages);
        System.out.println(CodingLanguages);
        CodingLanguages.sort(null);
        System.out.println(CodingLanguages);
        //To calculate size
        System.out.println(CodingLanguages.size());
        //For-each loop
        for(String s: CodingLanguages){
            System.out.println("Language: " + s);
        }

    }
    
}
