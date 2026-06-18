class Solution {
	public int getSecondLargest(int[] arr) {
		int max = -1;
		int max1 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}}
			for (int j = 0; j<arr.length; j++) {
				if (max == arr[j]) {
					arr[j] = 0;
				}
			}
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > max1) {
					max1 = arr[k]; }
				}
				if (max1 == 0) {
					return - 1;
				}
				else {
					return max1;
				}
				
			}
		}
