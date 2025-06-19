import java.util.Stack;

public class SortStackRecursively {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        // Base case: empty stack
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop top element
        int top = stack.pop();

        // Step 2: Recursively sort the rest
        sortStack(stack);

        // Step 3: Insert this element back in sorted order
        insertInSortedOrder(stack, top);
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // Base case: stack empty or top < element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Else: pop top and insert element below
        int top = stack.pop();
        insertInSortedOrder(stack, element);

        // Push original top back
        stack.push(top);
    }
}
