package stack.SimpleStack;

import java.util.LinkedList;

public class LinkedListCollectionStack<T> {
    private LinkedList<T> list;
    private int capacity;

    // Constructor to initialize stack
    public LinkedListCollectionStack(int cap) {
        list = new LinkedList<>();
        capacity = cap;
    }

    // Utility function to add an element x in the stack
    public void push(T x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack overflow!");
        }

        System.out.println("Inserting " + String.valueOf(x));
        list.push(x);
    }

    // Utility function to pop top element from the stack
    public T pop() throws Exception {
        // check for stack underflow
        if (isEmpty()) {
            throw new Exception("Stack is empty. Nothing to pop.");
        }

        // decrease stack size by 1 and (optionally) return the popped element
        T item = list.pop();
        System.out.println("Removing " + String.valueOf(item));
        return item;
    }

    // Utility function to return top element in a stack
    public T peek() throws Exception {
        if (!isEmpty())
            return list.peek();
        else
            throw new Exception("Stack is empty. Nothing to peek.");
    }

    // Utility function to return the size of the stack
    public int size() {
        return list.size();
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return list.size() == capacity;
    }
}
