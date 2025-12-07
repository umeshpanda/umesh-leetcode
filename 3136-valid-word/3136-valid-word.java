class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowl = false; boolean hasCons = false;

        for (char ch : word.toCharArray()){
            if (!Character.isLetterOrDigit(ch)) return false;

            if ("aeiouAEIOU".indexOf(ch) >= 0) hasVowl = true;
            else if (Character.isLetter(ch)) hasCons = true;
        }
        return hasVowl && hasCons;
    }
}