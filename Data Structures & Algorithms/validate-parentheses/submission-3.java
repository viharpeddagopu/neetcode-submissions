class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> stack = new Stack<>();

        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
                i++;
                continue;
            }

            if(c == ']' || c == '}' || c == ')'){
                if(stack.isEmpty())
                    return false;

                else{
                    char popped = stack.pop();

                    if(c==']' && popped != '[')
                    return false;
                    if(c=='}' && popped != '{')
                        return false;
                    if(c==')' && popped != '(')
                        return false;
                }
                i++;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
