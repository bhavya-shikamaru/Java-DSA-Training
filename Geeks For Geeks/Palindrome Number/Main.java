import java.util.*;
class Solution {
	public boolean isPalindrome(int n) {
		boolean c = true;
		int a = n;
		int b = 0;
		if (a<0){
			a = -1*a;
			n=-1*n;}
		
		while (a > 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		if (b == n) {
			c = true;
		} else {
			c = false;
		}
		
		return c;
	}
}

