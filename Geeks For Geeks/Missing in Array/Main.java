class Solution {
	int missingNum(int[] arr) {
		int xor1 = 0;
		int xor2 = 0;
		int n = arr.length + 1;
		
		for (int i = 0; i <= n; i++) {
			xor1 = xor1^i;
		}
		for (int j = 0; j<n-1; j++) {
			xor2 = xor2^arr[j];
		}
		return xor1^xor2;
	}
}
