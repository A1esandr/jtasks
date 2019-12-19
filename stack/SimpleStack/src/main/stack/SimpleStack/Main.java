package stack.SimpleStack;

public class Main {
    public static void main (String[] args) {
        System.out.println("========ArrayStack class========");
        ArrayStack stack = new ArrayStack(5);

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

        System.out.println("========ListStack class========");
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

        System.out.println("========LinkedListStack class========");
        LinkedListStack linkedListStack = new LinkedListStack(5);

        try {
            linkedListStack.push(1);		// Inserting 1 in the stack
            linkedListStack.push(2);		// Inserting 2 in the stack

            linkedListStack.pop();		// removing the top 2
            linkedListStack.pop();		// removing the top 1

            linkedListStack.push(3);		// Inserting 3 in the stack

            System.out.println("Top element is: " + linkedListStack.peek());
            System.out.println("Stack size is " + linkedListStack.size());

            linkedListStack.pop();		// removing the top 3
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        // check if stack is empty
        if (linkedListStack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");

        System.out.println("========LinkedListCollectionStack class========");
        LinkedListCollectionStack linkedListCollectionStack = new LinkedListCollectionStack(5);

        try {
            linkedListCollectionStack.push(1);		// Inserting 1 in the stack
            linkedListCollectionStack.push(2);		// Inserting 2 in the stack

            linkedListCollectionStack.pop();		// removing the top 2
            linkedListCollectionStack.pop();		// removing the top 1

            linkedListCollectionStack.push(3);		// Inserting 3 in the stack

            System.out.println("Top element is: " + linkedListCollectionStack.peek());
            System.out.println("Stack size is " + linkedListCollectionStack.size());

            linkedListCollectionStack.pop();		// removing the top 3
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        // check if stack is empty
        if (linkedListCollectionStack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }
}
