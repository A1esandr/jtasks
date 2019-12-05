import java.util.*;

// A user defined stack that supports getMin() in 
// addition to push() and pop() 
class StackWithMinValue {
    Stack<Integer> stack;
    Integer minValue;

    // Constructor 
    StackWithMinValue() {
        stack = new Stack<Integer>();
    }

    // Prints minimum element of StackWithMinValue
    void getMin() {
        // Get the minimum number in the entire stack 
        if (stack.isEmpty())
            System.out.println("Stack is empty");

        // variable minValue stores the minimum element in the stack.
        else
            System.out.println("Minimum element in the stack is: " + minValue);
    }

    // prints top element of StackWithMinValue 
    void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer topValue = stack.peek(); // Top element.

        System.out.print("Top element is: ");

        // If topValue < minValue means minValue stores value of topValue.
        if (topValue < minValue)
            System.out.println(minValue);
        else
            System.out.println(topValue);
    }

    // Removes the top element from StackWithMinValue 
    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top element removed: ");
        Integer topValue = stack.pop();

        // Minimum will change as the minimum element of the stack is being removed.
        if (topValue < minValue) {
            System.out.println(minValue);
            minValue = 2*minValue - topValue;
        } else {
            System.out.println(topValue);
        }
    }

    // Insert new number into StackWithMinValue 
    void push(Integer x) {
        if (stack.isEmpty()) {
            minValue = x;
            stack.push(x);
            System.out.println("Number inserted: " + x);
            return;
        }

        // If new number is less than original minValue
        if (x < minValue) {
            stack.push(2*x - minValue);
            minValue = x;
        } else {
            stack.push(x);
        }

        System.out.println("Number inserted: " + x);
    }
}