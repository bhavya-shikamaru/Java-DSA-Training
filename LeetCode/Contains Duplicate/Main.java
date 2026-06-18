class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> Num1 = new HashSet<>();
        for (Integer s : nums) {
            Num1.add(s);
        }
        if (Num1.size() == nums.length) {
            return false;
        } else {
            return true;
        }

    }
}