import java.util.Stack;
public class nextgreaterelementcircular {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 10, 8 };
    int[] result = nextGreaterElementCircular(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  public static int[] nextGreaterElementCircular(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    int[] nextGreater = new int[n];
    for (int i = 0; i < n; i++) {
      nextGreater[i] = -1; // Initialize with -1
    }
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n * 2; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i % n]) {
        nextGreater[stack.pop()] = arr[i % n];
      }
      if (i < n) {
        stack.push(i);
      }
      //
    }
    for (int i = 0; i < n; i++) {
      res[i] = nextGreater[i];
    }
    return res;
  }
}
