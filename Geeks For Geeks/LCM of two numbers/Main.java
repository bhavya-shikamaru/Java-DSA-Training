class Solution {
	public int lcm(int a, int b) {
		int n;
		
		if (a>b) {
			n = a;
		}
		else {
			n = b;
		}
		
		int d = a - b;
		if (d<0) {
			d = d*-1;
		}
		
		while (n != 0) {
			int temp = n;
			n = d % n;
			d = temp;
			
		}
		return (a * b) / d;
	}
}
