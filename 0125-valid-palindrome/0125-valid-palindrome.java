class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        for (char ch : s.toCharArray()) {
            str += ch;
        }
        String st = new StringBuilder(str).reverse().toString();
        return st.equals(str);
    }
}