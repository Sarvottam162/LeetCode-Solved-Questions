class CustomStack {

    private int size;
    private int arr[];
    private int top;

    public CustomStack(int maxSize) {
        
        this.size = maxSize;
        this.arr = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int x) {
        if( top < size - 1){
        top++;
        arr[top] = x;
        }
    }
    
    public int pop() {
        if(top == -1) return -1;
        int value = arr[top];
        top--;
        return value;
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i <= Math.min(top, k - 1); i++){
         arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */