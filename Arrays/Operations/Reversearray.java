public class Reversearray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
