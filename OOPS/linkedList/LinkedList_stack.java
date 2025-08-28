package OOPS;

import java.util.LinkedList;

public class LinkedList_stack {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        // push (add to end)
        stack.push("apple");
        stack.push("mango");
        stack.push("orange");

        System.out.println("Stack: " + stack);

        // pop (remove last added element)
        System.out.println("Popped: " + stack.pop());

        // peek (top element)
        System.out.println("Top: " + stack.peek());

        System.out.println("Stack after operations: " + stack);
    }
}
