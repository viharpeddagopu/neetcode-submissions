class MinStack {
    Deque<Integer> minStack;
    Deque<Integer> minTracker;

    public MinStack() {
        minStack = new ArrayDeque<>();
        //track the min at each level
        //becase say its [5], min = 5
        //now, its [5,3], min =3
        //pop --> [5], now the min should be 5, that why we need this tracker at each level
        minTracker = new ArrayDeque<>();
    }
    
    public void push(int val) {
        minStack.push(val);
        
        if(minTracker.isEmpty())
            minTracker.push(val);
        else{
            int currMin = Math.min(minTracker.peek(), val);
            minTracker.push(currMin);
        }
    }
    
    public void pop() {
        minStack.pop();
        minTracker.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return minTracker.peek();
    }
}
