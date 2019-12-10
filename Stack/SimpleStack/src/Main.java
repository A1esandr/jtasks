public class Main {
    public static void main (String[] args) {
        Stack stack = new Stack(5);

        try {
            stack.push(1);		// Inserting 1 in the stack
            stack.push(2);		// Inserting 2 in the stack

            stack.pop();		// removing the top 2
            stack.pop();		// removing the top 1

            stack.push(3);		// Inserting 3 in the stack

            System.out.println("Top element is: " + stack.peek());
            System.out.println("Stack size is " + stack.size());

            stack.pop();		// removing the top 3
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");

        ListStack listStack = new ListStack(5);

        try {
            listStack.push(1);		// Inserting 1 in the stack
            listStack.push(2);		// Inserting 2 in the stack

            listStack.pop();		// removing the top 2
            listStack.pop();		// removing the top 1

            listStack.push(3);		// Inserting 3 in the stack

            System.out.println("Top element is: " + listStack.peek());
            System.out.println("Stack size is " + listStack.size());

            listStack.pop();		// removing the top 3
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        // check if stack is empty
        if (listStack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }
}
