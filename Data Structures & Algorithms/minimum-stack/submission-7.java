//using arraylist implementation of stack
class MinStack {
    
    // The list will hold arrays of size 2: [value, current_minimum]
    private List<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            // If empty, the value is also the minimum
            stack.add(new int[]{val, val});
        } else {
            // Otherwise, compare the new value with the previous minimum
            int previousMin = stack.get(stack.size() - 1)[1];
            int currentMin = Math.min(val, previousMin);
            
            stack.add(new int[]{val, currentMin});
        }
    }
    
    public void pop() {
        // Remove the very last element in the list (O(1) time)
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        // Get the value (index 0) from the last element
        return stack.get(stack.size() - 1)[0];
    }
    
    public int getMin() {
        // Get the minimum (index 1) from the last element
        return stack.get(stack.size() - 1)[1];
    }
}