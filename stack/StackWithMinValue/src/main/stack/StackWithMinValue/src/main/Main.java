package stack.StackWithMinValue.src.main;

import stack.StackWithMinValue.src.main.StackWithMinValue;

public class Main {
    public static void main(String[] args) {
        StackWithMinValue stack = new StackWithMinValue();
        stack.push(5);
        stack.push(7);
        stack.getMin();
        stack.push(3);
        stack.push(1);
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.peek();
        stack.getMin();
    }
}