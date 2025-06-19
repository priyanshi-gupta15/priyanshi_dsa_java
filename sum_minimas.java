import java.util.Stack;
public class sum_minimas {
  public static void main(String[] args) {
    int[] heights = { 3, 1, 2, 4 };
    System.out.println("Sum of Minimas: " + sumOfMinimas(heights));
  }
  

  public static int sumOfMinimas(int[] heights) {
    int n = heights.length;
    int[] nextSmallest = new int[n];
    int[] prevSmallest = new int[n];
    Stack<Integer> st = new Stack<>();

    //calculate nse
    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
        st.pop();
      }
      if (st.isEmpty()) {
        nextSmallest[i] = n;

      } else {
        nextSmallest[i] = st.peek();
      }
      st.push(i);
    }
    

    //clear stack because we use monotonic stack;
    st.clear();

    //calsculate pse;

    for (int i =0; i <n; i++) {
      while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
        st.pop();
      }
      if (st.isEmpty()) {
        prevSmallest[i] = -1;

      } else {
        prevSmallest[i] = st.peek();
      }
      st.push(i);
    }
    

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += heights[i] * (i - prevSmallest[i]) * (nextSmallest[i] - i);
        
    }
    return sum;
  }
  
}
