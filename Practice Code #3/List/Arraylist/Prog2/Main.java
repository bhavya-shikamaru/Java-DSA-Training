import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Integer> Nums = new ArrayList<>();
        Nums.add(1);
        Nums.add(2);
        Nums.add(7);
        Nums.add(3);
        Nums.add(4);
        Nums.add(5);
        Nums.sort(null);
        for(int i=0;i<Nums.size();i++){
            System.out.print(Nums.get(i)+" ");
        }
        Nums.add(3,18);
        Collections.sort(Nums);
                for(Integer s : Nums){
            System.out.print(s+" ");
        }

    }
    
}
