class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int reminder = columnNumber % 26;
            char ch = (char)('A' + reminder);
            s.append(ch);
            columnNumber /= 26;
        }
       return  s.reverse().toString();
    }
}