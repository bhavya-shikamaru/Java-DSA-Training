class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int count = 0;
        int prod = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
            prod = prod*nums[i];}
        }
        if(count == 0){
            for(int k =0;k<nums.length;k++){
            answer[k]=prod/nums[k];
            }

        }
        else if (count == 1){
            for(int j = 0;j<nums.length;j++){
                if(nums[j]==0){
                    answer[j] = prod; 
                } 
                else {
                    answer[j] = 0;   
                }

                }
            }
        else{
            for (int l = 0; l<nums.length;l++){
                answer[l]=0;
            }
        }
        return answer;
    }
}