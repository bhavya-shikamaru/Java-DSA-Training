class Solution {
    public int findNumbers(int[] nums) {
        int a=0,b=0;
        for(int i =0; i<nums.length; i++){
            a=0;
            while (nums[i]!=0){
                nums[i]=nums[i]/10;
                a++;}
            
            if(a%2==0){
                b++;

            }
        }
        return b;
    }
}