class Solution {
    static int sumOfDigits(int n) {
        int a= 0,b=n;
        while(b!=0){
            a=a+b%10;
            b=b/10;
        }
        return a;
        // code here
        
    }
}
