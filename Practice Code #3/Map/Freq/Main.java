import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> List = new ArrayList<>();
        System.out.println("Enter the size of the list:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter the element:");
            int element = sc.nextInt();
            List.add(element);
        }

        Map<Integer, Integer> freq = new HashMap<>();
        //Approach 1
       /*  for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < List.size(); j++) {
                if (List.get(j) == i) {
                    count++;
              }
            }
            freq.put(i, count);
        }
        System.out.println(freq);*/
        //Approach 2

        for(int i : List){
            freq.put(i, freq.getOrDefault(i,0)+1);

        }
        System.out.println(freq);
        sc.close();
    }
    
}
