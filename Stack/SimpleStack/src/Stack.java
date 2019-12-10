public interface Stack <T> {
    T pop() throws Exception;           // return the top item and removes it from stack
    void push(T item) throws Exception; // adds an item to the stack
    T peek() throws Exception;          // return the top item in stack
    boolean isEmpty(); // returns true if stack is empty, false otherwise
    boolean isFull();  // returns true if stack is full, false otherwise
    int size();        // returns the number of items in stack right now
}
