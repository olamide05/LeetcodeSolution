

class MinStack {
    private Stack<Integer> ogstack;
    private Stack<Integer> min;

    public MinStack() {
        ogstack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        ogstack.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        if (ogstack.isEmpty()) return;
        if (ogstack.pop().equals(min.peek())) {
            min.pop();
        }
    }

    public int top() {
        return ogstack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
