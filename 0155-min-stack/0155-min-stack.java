class MinStack {
    private class ListNode{
        int val;
        ListNode next;

            ListNode(int val){
                this.val = val;
                this.next = null;
            }
    }
        private ListNode top ;
        private int min;

    public MinStack() {
        top = null;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        ListNode x = new ListNode(value);
        x.next = top;
        top = x;
        if(value < min) min = value;
    }
    
    public void pop() {

    if(top == null)
        return;

    int removed = top.val;

    top = top.next;

    if(removed == min){

        min = Integer.MAX_VALUE;

        ListNode temp = top;

        while(temp != null){

            min = Math.min(min, temp.val);

            temp = temp.next;
        }
    }
            
    }
    
    public int top() {
        if(top == null)return -1;
        return top.val;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */