

import java.util.Stack;

public class nextgreaterelement {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 10, 8 };
    int[] result = nextGreaterElement(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  public static int[] nextGreaterElement(int[] arr)
  {
    Stack<Integer> st = new Stack<>();
    int[] res = new int[arr.length];
    
    for(int i=arr.length-1;i>=0;i--)
    {
      while(!st.isEmpty()&& st.peek()<=arr[i])
      {
        st.pop();
      }
       if(st.isEmpty())
       {
          res[i] = -1; // No greater element found
        }
        else
        {
          res[i] = st.peek(); // Next greater element
        }
        st.push(arr[i]); // Push current element onto stack
    }


    return res;
  }
  
}
