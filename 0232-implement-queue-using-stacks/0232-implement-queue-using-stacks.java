class MyQueue {
    private Stack<Integer> write=new Stack<>();
    private Stack<Integer> read=new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        write.push(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        transfer();
        return read.pop();
    }
    
    public int peek() {
        if(empty()){
            return -1;
        }
        transfer();
        return read.peek();
    }
    
    public boolean empty() {
        return write.isEmpty() && read.isEmpty();
    }
    
    public void transfer(){
        if(read.isEmpty()){
            while(!write.isEmpty()){
                read.push(write.pop());
            }
        }
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