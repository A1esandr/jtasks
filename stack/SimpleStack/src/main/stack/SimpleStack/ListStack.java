package stack.SimpleStack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> {
    private List<T> arr;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    ListStack(int size) {
        arr = new ArrayList<>();
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack
    public void push(T x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack overflow!");
        }

        System.out.println("Inserting " + String.valueOf(x));
        arr.add(x);
        top++;
    }

    // Utility function to pop top element from the stack
    public T pop() throws Exception {
        // check for stack underflow
        if (isEmpty()) {
            throw new Exception("Stack is empty. Nothing to pop.");
        }

        System.out.println("Removing " + String.valueOf(peek()));

        // decrease stack size by 1 and (optionally) return the popped element
        top--;
        return arr.get(top+1);
    }

    // Utility function to return top element in a stack
    public T peek() throws Exception {
        if (!isEmpty())
            return arr.get(top);
        else
            throw new Exception("Stack is empty. Nothing to peek.");
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty() {
        return top == -1;	// or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;	// or return size() == capacity;
    }
}
