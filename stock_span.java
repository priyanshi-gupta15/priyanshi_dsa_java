import java.util.*;
public class stock_span {
  public static void main(String[] args) {
    int[] prices = { 100, 80, 60, 70, 60, 75, 72 };
    int[] result = calculateStockSpan(prices);
    for (int span : result) {
      System.out.print(span + " ");
    }
  }

  public static int[] calculateStockSpan(int[] prices) {
    int n = prices.length;
    int[] span = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
        stack.pop();
      }
      span[i] = (stack.isEmpty()) ? i + 1 : i - stack.peek();
      stack.push(i);
    }
    return span;

  }
}
