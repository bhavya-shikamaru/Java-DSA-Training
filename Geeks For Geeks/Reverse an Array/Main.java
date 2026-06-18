class Solution {
    public void reverseArray(int arr[]) {
        // code here
         int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        }
    }
