class Solution {
    public int climb(int n,int a[]){
        if(n==0)return 1;
        if (n<0)return 0;
        if(a[n]!=-1){
            return a[n];
        }
        a[n]=climb(n-2,a)+climb(n-1,a);
        return a[n];
    }
    public int climbStairs(int n) {
        int a[]= new int[n+1];
        Arrays.fill(a,-1);
        return climb(n,a);  
    }
}