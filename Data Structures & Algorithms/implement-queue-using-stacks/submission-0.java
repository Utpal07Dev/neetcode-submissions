class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(stack1.isEmpty()){
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        }
       return stack1.pop();
    }
    
    public int peek() {
        if(stack1.isEmpty()){
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        }
       return stack1.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty()&&stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */