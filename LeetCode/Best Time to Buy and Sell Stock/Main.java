class Solution {
    public int maxProfit(int[] prices) {
        int o = 0, a = 0;
        int l = prices.length;
        int min = prices[0];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
                o = i;
            }

            int profit = prices[i] - min;

            if (profit > max) {
                max = profit;
                a = i;
            }
        }

        return max;
    }
}