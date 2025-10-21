class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            int a =q1.poll();
            q2.add(a);
        }
        while(!q2.isEmpty()){
            int a=q2.poll();
            q1.add(a);
        }
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return 0;
        }
        return q1.poll();
        
    }
    
    public int top() {
        if(q1.isEmpty()){
            return 0;
        }
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */