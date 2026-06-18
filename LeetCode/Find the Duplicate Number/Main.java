class Solution {
    public int findDuplicate(int[] nums) {
        int a[] = new int[nums.length];
        for (int c : a) {
            a[c] = 0;
        }
        for (int n : nums) {
            a[n]++;
            if (a[n] >= 2) {
                return n;
            }
        }

        return 0;

    }
}