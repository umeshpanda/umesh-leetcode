class Solution {
    public long getDescentPeriods(int[] prices) {
         long result = 1;  // Single day is always 1 period
        long streak = 1;  // Current smooth descent length
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i-1] - 1) {
                // Continue streak: n periods = 1+2+...+n = n*(n+1)/2
                streak++;
                result += streak;
            } else {
                // Reset streak
                result++;
                streak = 1;
            }
        }
        return result;
    }
}