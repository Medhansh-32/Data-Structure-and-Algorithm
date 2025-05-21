package Recursion.pattern_1;

import java.util.Stack;

public class Sort_Stack {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(0);
        stack.push(3);
        stack.push(45);
        stack.push(-1);
        sortStack(stack);
        System.out.println("Sorted Stack (Ascending Order):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
