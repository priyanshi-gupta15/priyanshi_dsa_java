import java.util.Arrays;
import java.util.Stack;


public class next_greater_2 {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,3};
    System.out.println(Arrays.toString(nextGreaterElements(nums)));

    
  }
  static int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int[]  arr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++)
        {
            arr[i]=-1;
        }

        for(int i=0;i<n*2;i++)
        {
            while(!stack.isEmpty() && nums[stack.peek()] <nums[i%n])
            {
                arr[stack.pop()]=nums[i%n];
            }

            if(i<n)
            {
                stack.push(i);
            }
        }
        return arr;
        
        
    }
}

