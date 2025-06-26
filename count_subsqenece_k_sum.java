public class count_subsqenece_k_sum {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
        int target = 2;

        int count = countSubsequences(0, arr, 0, target);
        System.out.println("Count of subsequences with sum = " + target + ": " + count);

    }

    public static int countSubsequences(int index, int[] arr, int sum, int target) {
        if (index == arr.length) {
            return sum == target ? 1 : 0;
        }

        // Include current element
        int include = countSubsequences(index + 1, arr, sum + arr[index], target);

        // Exclude current element
        int exclude = countSubsequences(index + 1, arr, sum, target);

        return include + exclude;
    }
  
}
