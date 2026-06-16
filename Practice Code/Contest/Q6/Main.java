class Student{
    String name;
    int rollno;
    int marks;

}

class Main{
    public static void main(String[] args){
        Student student1= new Student();
        student1.name="Bhavya";
        student1.rollno=25105;
        student1.marks=82;

        System.out.println(student1.name);
        System.out.println(student1.rollno);
        System.out.println(student1.marks);

        Student student2 = new Student();
        student2.name="Rashi";
        student2.rollno=25095;
        student2.marks=200;

        System.out.println(student2.name);
        System.out.println(student2.rollno);
        System.out.println(student2.marks);


    }
}
