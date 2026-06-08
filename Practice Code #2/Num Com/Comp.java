class Student{
    static int roll = 105;
    static Integer marks = 90;
    static Integer marks2 = 80;

    static void display(){
    System.out.println(marks == marks2);
    }

public class Comp {
    public static void main(String[] args) {

        if(Student.marks == Student.marks2){
            System.out.println("Marks are equal");
        }
        else{
            System.out.println("Marks are not equal");
        }
                Student.display();
    }
}
    }
