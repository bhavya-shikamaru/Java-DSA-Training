class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum =0;
        int max=0;
        
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;
        for(int j=k;j<arr.length;j++){
            sum=sum+arr[j]-arr[j-k];
            if (sum>max){
                max = sum;
                
            }
        }
        return max;
    }
}