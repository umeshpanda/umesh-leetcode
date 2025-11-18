class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            char bkt = 'a';
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                bkt = stack.pop();
                if (ch == ')' && bkt != '(' || ch == '}' && bkt != '{' || ch == ']' && bkt != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}