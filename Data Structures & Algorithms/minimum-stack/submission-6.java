//using linkedlist implemenation of stack

class MinStack {

    private class Node{
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    //top of stack
    Node head;

    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null)
            head = new Node(val, val, null);
        else{
            int currMin = Math.min(head.min, val);
            head = new Node(val, currMin, head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
