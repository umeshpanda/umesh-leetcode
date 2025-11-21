class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int a = prices[i] - min;
            res = Math.max(res, a);
        }
        return res;
    }
}