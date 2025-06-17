
import java.util.*;

public class removeconsecutive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8};
        int[] result = removeConsecutiveSubsequences(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeConsecutiveSubsequences(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while (i < arr.length) {
            int current = arr[i];
            int count = 1;

            // Count how many times current number repeats consecutively
            while (i + 1 < arr.length && arr[i + 1] == current) {
                i++;
                count++;
            }

            if (count == 1) {
                // Only one occurrence — keep it
                stack.push(current);
            }
            // else: If count > 1 — skip (remove whole group)

            i++;
        }

        // Now collect result
        List<Integer> resultList = new ArrayList<>();
        while (!stack.isEmpty()) {
            resultList.add(stack.pop());
        }

        // Reverse the list to correct order
        Collections.reverse(resultList);

        // Convert to int[]
        int[] res = new int[resultList.size()];
        for (int j = 0; j < resultList.size(); j++) {
            res[j] = resultList.get(j);
        }

        return res;
    }
}
