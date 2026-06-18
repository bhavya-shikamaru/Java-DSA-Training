class Solution {
    public static int countDigits(int n) {
        // Code here
        int a= 0,b=n;
        while(b!=0){
            a++;
            b=b/10;
        }
        return a;
    }
}
