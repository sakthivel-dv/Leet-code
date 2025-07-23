class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> st = new Stack<>();

    public MinStack() {
        // no need to set min to val here
    }

    public void push(int val) {
        if (val <= min) {
            st.push(min);  // Save the previous min
            min = val;     // Update min
        }
        st.push(val);      // Always push the actual value
    }

    public void pop() {
        if (st.pop() == min) {
            min = st.pop();  // Restore previous min
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min;
    }
}
