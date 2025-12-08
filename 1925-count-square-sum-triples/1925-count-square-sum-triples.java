class Solution {
    public int countTriples(int n) {
        int res = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                long sumSq = (long)a * a + (long)b * b;
                int c = (int)Math.sqrt(sumSq);
                if (c <= n && (long)c * c == sumSq) {
                    res++;
                }
            }
        }
        return res;
    }
}
