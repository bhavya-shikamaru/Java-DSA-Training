
import java.util.*;

class Student{
    String name;
    String id;
    int Roll;
    int Marks;

    Student(String name, String id, int Roll, int Marks){
        this.name =name;
        this.id=id;
        this.Roll=Roll;
        this.Marks=Marks;

    }
    @Override
    public String toString(){
        return id + " "+name+" "+Marks+" "+Roll+" ";
    }
}
class MarksComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.Marks-s2.Marks;
    }
}
public class Main {
    public static void main(String[] args){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Rashi", "CS", 95, 90));
        students.add(new Student("Bhavya", "CS", 105, 20));
        System.out.println(students);
        Collections.sort(students,new MarksComparator());
        System.out.println(students);
        Collections.sort(students,(s1,s2)->(s1.Roll-s2.Roll));
        System.out.println(students);


    }

    
}
