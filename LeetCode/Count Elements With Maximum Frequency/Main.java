class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        int max = 0;
        for (int i : nums) {
            if (freq.get(i) > max) {
                max = freq.get(i);
            }

        }
        int total = 0;

        for (int f : freq.values()) {
            if (f == max) {
                total += max;
            }
        }

        return total;
    }
}