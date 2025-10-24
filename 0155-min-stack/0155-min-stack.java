class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> ms = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(Integer val) {
        if(ms.empty()){
            ms.push(val);
        }else{
            if(ms.peek()>=val){
                ms.push(val);
            }
        }
        s.push(val);
    }
    
    public void pop() {
        if(s.empty()){
            return;
        }
        int m = s.pop();
        if((!ms.empty())&&m==ms.peek()){
            ms.pop();
        }
    }
    
    public int top() {
        if(s.empty()){
            return 0;
        }
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */