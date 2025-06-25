import java.util.*;
  public class celebrity_problem {
    public static void main(String[] args) {
      int[][] m = {{0,1},{1,0}};
      int n = m.length;
      System.out.println(celebrity(m, n));
    }
  
  public static int celebrity(int[][] m ,int n)
  {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < n; i++) {
      st.push(i);
    }
    
    while(st.size()>1)
    {
      int v1 = st.pop();
      int v2 = st.pop();
      if (m[v1][v2] == 1) // v1 knows v2
      {
        st.push(v2); // v2 is a potential celebrity
      } else if (m[v2][v1] == 1) // v2 knows v1
      {
        st.push(v1); // v1 is a potential celebrity
      }

    }

    if(st.isEmpty())
    {
      return -1;
    }
    int potentialCelebrity = st.pop();
    // Verify if the potential celebrity is indeed a celebrity
    for (int i = 0; i < n; i++) {
      if (i != potentialCelebrity) {
        // Check if potentialCelebrity knows i
        if (m[potentialCelebrity][i] == 1 || m[i][potentialCelebrity] == 0) {
          return -1; // Not a celebrity
        }
      }
    }
    return potentialCelebrity;
  }
  
}
