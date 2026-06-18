class Solution {
    public int majorityElement(int[] nums) {

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

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (Objects.equals(max, entry.getValue())) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
