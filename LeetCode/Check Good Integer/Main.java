class Solution {
    public boolean checkGoodInteger(int n) {
        int a = n;
        int sum =0;
        int sum1=0;
        while(a>0){
            int rem = a%10;
            sum+= rem;
            sum1+=rem*rem;
            a=a/10;
        }
        if(sum1-sum>=50){
            return true;
        }
        else
            return false;
        
    }
}