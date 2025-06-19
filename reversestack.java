
import java.util.Stack;

public class reversestack {
  //suding recursion;
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    System.out.println("Original Stack: " + stack);
    System.out.println("Reversed Stack: ");
    reverseStack(stack);
  }

  public static void reverseStack(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }

    //using recusrion
    System.out.print(stack.pop()+"  ");
    reverseStack(stack);

  }
}
