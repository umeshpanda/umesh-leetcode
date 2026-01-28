class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String res1 = new String(ch);
        char c[] = t.toCharArray();
        Arrays.sort(c);
        String res2 = new String(c);

        return res1.equals(res2);
    }
}