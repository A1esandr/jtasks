public class LinkedListStack <T> implements Stack <T> {
    private Node head; //the first node
    private int size; // number of items
    private int capacity;

    //nested class to define node
    private class Node {
        T item;
        Node next;
    }

    // Constructor to initialize stack
    public LinkedListStack(int cap) {
        head = null;
        capacity = cap;
        size = 0;
    }

    // Utility function to add an element x in the stack
    public void push(T x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack overflow!");
        }

        System.out.println("Inserting " + String.valueOf(x));
        Node oldHead = head;
        head = new Node();
        head.item = x;
        head.next = oldHead;
        size++;
    }

    // Utility function to pop top element from the stack
    public T pop() throws Exception {
        // check for stack underflow
        if (isEmpty()) {
            throw new Exception("Stack is empty. Nothing to pop.");
        }

        // decrease stack size by 1 and (optionally) return the popped element
        T item = head.item;
        head = head.next;
        size--;
        System.out.println("Removing " + String.valueOf(item));
        return item;
    }

    // Utility function to return top element in a stack
    public T peek() throws Exception {
        if (!isEmpty())
            return head.item;
        else
            throw new Exception("Stack is empty. Nothing to peek.");
    }

    // Utility function to return the size of the stack
    public int size() {
        return size;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return size == capacity;
    }
}
