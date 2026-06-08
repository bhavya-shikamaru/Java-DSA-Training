public class Even {
    public static void main(String[] args){
        int num=0;
        int arr[] = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                num++;
            }
        }
        System.out.println("Number of even numbers in the array: " + num);
    }
    
}
