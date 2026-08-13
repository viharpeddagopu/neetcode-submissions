class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Use a standard for-loop with charAt to avoid memory allocation overhead!
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}