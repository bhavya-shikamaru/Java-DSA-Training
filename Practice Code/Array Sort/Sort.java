import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1= arr.clone();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr1[i]){
                System.out.println("The array is not sorted");
                return;
            }
        }
        System.out.println("The array is sorted");
    }
    
}
