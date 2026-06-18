class Solution {
	static ArrayList<Integer> leaders(int arr[]) {
		ArrayList<Integer> nums = new ArrayList<>();
		int max = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= max) {
				nums.add(0, arr[i]);
			}
			if(max<arr[i]){
			    max=arr[i];
			}
		}
		return nums;
	}
	
}
