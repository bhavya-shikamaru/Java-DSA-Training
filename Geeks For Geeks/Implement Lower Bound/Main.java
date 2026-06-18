class Solution {
	int lowerBound(int[] arr, int target) {
		int l = 0;
		int ans = arr.length;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r)/2;
			if (arr[mid]>=target) {
			    ans=mid;
				r = mid -1;
			}
			else {
				l = mid + 1;
			}
			
		}
		return ans; 
	}
}
