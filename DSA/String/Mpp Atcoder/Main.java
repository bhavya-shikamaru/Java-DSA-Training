import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
 
        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
        int highestfreq = 0;
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            highestfreq = Math.max(highestfreq, entry.getValue());
        }

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(freq.get(c) != highestfreq){
                ans += c;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}