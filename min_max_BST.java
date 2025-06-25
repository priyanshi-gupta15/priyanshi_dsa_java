public class min_max_BST {
  public static class Node {
    Node left;
    Node right;
    int val;

    public Node(int val) {
      left = right = null;
      this.val = val;
    }
  }


  //min value function

  public static void min(Node root)
  {
    if (root.left == null)
    {
      System.out.println(root.val);
      return;
    }
    min(root.left);
  }
  //max value function

  public static void max(Node root)
  {
    if (root.right == null)
    {
      System.out.println(root.val);
      return;
    }
    max(root.right);
  }
  
  public static void main(String[] args) {
    Node root = new Node(20);
    Node a = new Node(10);
    Node b = new Node(30);
    root.left = a;
    root.right = b;
    Node c = new Node(5);
    Node d = new Node(15);
    a.left = c;
    a.right = d;
    Node e = new Node(25);
    Node f = new Node(35);
    b.left = e;
    b.right = f;


    //min value
    min(root);

    //max value
    max(root);
  }
  
}
