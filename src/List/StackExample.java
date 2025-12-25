package List;

import java.util.Stack;

public class StackExample {
    static void main() {
        Stack<String> stack = new Stack<>();

        // 1. push() method to add elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // 2. pop() method to remove the top element
        String topElement = stack.pop();
        System.out.println("Popped element: " + topElement);
        System.out.println("Stack after pop: " + stack);

        // 3. peek() method to view the top element without removing it
        String peekElement = stack.peek();
        System.out.println("Top element (peek): " + peekElement);
        System.out.println("Stack after peek: " + stack);

        // 4. search() method to find the position of an element
        int position = stack.search("Apple");
        System.out.println(STR."Position of 'Apple' in stack: \{position}");

        // Final Stack
        System.out.println("Final Stack: " + stack);
    }
}
