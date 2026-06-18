class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(ans);
        return ans[nums.length-k];
        
    }
}