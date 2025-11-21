class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> hs = new HashSet();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            hs.add(s.charAt(i));
        }
        for (char ch : hs) {
            int left = -1;
            int right = -1;
            for (int i = 0; i < n; i++) {
                if (ch == s.charAt(i)) {
                    if (left == -1) {
                    left = i;
                    }
                
                right = i;
                }
            }
            if (right == left) continue;
             HashSet<Character> hs1 = new HashSet();
             for (int i = left + 1; i < right; i++) {
                hs1.add(s.charAt(i));
            }
            count += hs1.size();
        }
        return count;
    }
}