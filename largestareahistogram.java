import java.util.Stack;
public class largestareahistogram {
  public static void main(String[] args) {
    int[] heights = { 2, 1, 5, 6, 2, 3 };
    System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
  }
  
  public static int largestRectangleArea(int[] heights) {
    //caalculate next smallest elemet
    int n = heights.length;
    int[] nextSmallest = new int[n];
    int[] prevSmallest = new int[n];
    //prevest smallest element
    
    Stack<Integer> stack = new Stack<>();
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        nextSmallest[i] = n;
      } else {
        nextSmallest[i] = stack.peek();
      }
      stack.push(i);
    }
    //calculate previous smallest element
    stack.clear();
    stack.push(0);
    prevSmallest[0] = -1;
    for (int i = 1; i < n; i++) {

      while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        prevSmallest[i] = -1;
      } else {
        prevSmallest[i] = stack.peek();
      }
      stack.push(i);

    }
    int max = -1;
    for (int i = 0; i < n; i++) {
      int area = (nextSmallest[i] - prevSmallest[i] - 1) * heights[i];
      max = Math.max(max, area);

    }
    return max;
    
      
  }
  
}
