
public class children_sum_BT {


  public static class Node {
    Node left;
    Node right;
    int val;

    public Node(int val) {
      left = right = null;
      this.val = val;
    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    Node a = new Node(8);
    Node b = new Node(2);
    root.left = a;
    root.right = b;
    Node c = new Node(3);
    Node d = new Node(5);
    a.left = c;
    a.right = d;
    Node e = new Node(2);
    b.left = e;

    System.out.println(checkChildrenSum(root));
  }

  public  static boolean checkChildrenSum(Node root) {
    if (root == null || (root.left == null && root.right == null)) {
      return true; // null or leaf node is valid
    }

    int leftVal = (root.left != null) ? root.left.val : 0;
    int rightVal = (root.right != null) ? root.right.val : 0;

    boolean currentValid = (root.val == leftVal + rightVal);
    boolean leftCheck = checkChildrenSum(root.left);
    boolean rightCheck = checkChildrenSum(root.right);

    return currentValid && leftCheck && rightCheck;

  }
}
