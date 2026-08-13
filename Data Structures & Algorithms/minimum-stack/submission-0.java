class MinStack {

    Deque<Integer> st = new ArrayDeque<>();
    Deque<Integer> Minst = new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {

        st.push(val);

        if(Minst.isEmpty() || Minst.peek()>= val){
            Minst.push(val);
        }
        
    }
    
    public void pop() {
       int val = st.pop();
       if(Minst.peek() == val){
        Minst.pop();
       }
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {
        return Minst.peek();
    }
}
