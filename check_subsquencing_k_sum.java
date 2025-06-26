
public class check_subsquencing_k_sum {
  //if k sum find return true else return false;
  public static void main(String[] args) {
    //given an array 
    int[] arr = {4,3,9,2};
    int k =10;  //target sum
    // List<Integer> current = new List<>();
    boolean ans = check_k_sum(arr, k, 0, 0);
     System.out.println(ans);
  }

  public static boolean check_k_sum(int[] arr, int target, int sum, int index) {
    if(index == arr.length)
    {
        return sum == target;
    }
    if(sum == target)
    {
      return true;
    }

    return check_k_sum(arr, target, sum + arr[index], index + 1) || check_k_sum(arr, target, sum, index+1) ;
      
  }
}
