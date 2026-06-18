// User function Template for Java

class Solution {
    static boolean isLeap(int N) {
        
        if(N%100!=0 && N%4==0) return true;
        else if(N%400==0) return true;
        else return false;
        // code here
        
    }
}