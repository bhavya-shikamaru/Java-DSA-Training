class Solution {
    public boolean isPowerOfTwo(int n) {

        boolean v=false;
        if(n<=0){
            v=false;
        }
        else if(n==1){
            v=true;
        }
        else{        
        int a=1;
        for(int i=0; i<=31; i++){
            a=a*2;
            if(a==n){
                v=true;
                break;
            }
            else continue;
        }}
        return v;
        
    }
}