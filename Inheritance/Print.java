class Printer{
    int cp;
    String sec;
    void printDocument(int a){
        cp=a;
        System.out.println("Printing "+cp+" copies");

    }
    void printDocument(String b){
        sec=b;
        System.out.println("Printing secret message: "+sec);
    }
}
public class Print {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printDocument(5);
        p.printDocument("Rashii");
     
    }

    
}
