class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;
        int sum = 0;
        boolean isValid = true;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') count++;
            else if (isValid) {
                int idx = n - 1 - i;
                sum += Math.pow(2, idx);
                if (sum <= k) {
                    count++;
                } else {
                    isValid = false;
                }
            }
        }
        return count;
    }
}