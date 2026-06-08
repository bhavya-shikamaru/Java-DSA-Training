import java.io.FileInputStream;
class Main {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\bhavy\\Desktop\\Certificates\\Java\\Practice Code #3\\src\\Practice Code #3\\File Handling\\file.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}