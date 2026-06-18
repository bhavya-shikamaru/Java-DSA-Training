class Solution {
    public void moveZeroes(int[] nums) {
        int n =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[n]=nums[i];
                n=n+1;
            }}
        for(int j=n;j<nums.length;j++){
            nums[j]=0;
        }

        
    }
}