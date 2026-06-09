import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = sc.next().toLowerCase();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                count++;
            }
        }
        System.out.println("Number of vowels in the word: " + count);
        sc.close();
    }
}