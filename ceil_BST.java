public class ceil_BST {
  public static class Node {
    Node left;
    Node right;
    int val;

    public Node(int val) {
      left = right = null;
      this.val = val;
    }
  }

  public  static int ceil(Node root,int val)
  {
    int ceilval = -1;

    while (root != null)
    {
      if (root.val == val) {
        ceilval = root.val;
        return ceilval;
      }
      if (root.val < val) {
        root = root.right;
      } else {
        ceilval = root.val;
        root = root.left;
      }
    }
    return ceilval;


  }
  public  static int floor(Node root,int val)
  {
    int floorval = -1;

    while (root != null)
    {
      if (root.val == val) {
        floorval = root.val;
        return floorval;
      }
      if (root.val > val) {
        root = root.left;
      } else {
        floorval = root.val;
        root = root.right;  
      }
    }
    return floorval;


  }

  public static void main(String[] args) {

    Node root = new Node(10);
    Node a = new Node(5);
    Node b = new Node(13);
    root.left = a;
    root.right = b;
    Node c = new Node(3);
    Node d = new Node(6);
    a.left = c;
    a.right = d;
    Node e = new Node(11);
    Node f = new Node(14);
    b.left = e;
    b.right = f;
    Node g = new Node(2);
    Node h = new Node(4);
    c.left = g;
    c.right = h;
    Node i = new Node(9);
    d.right = i;

    int target = 13;

    int ans = floor(root, target);

    //   if (ans != -1) {
    //     System.out.println("Ceiling of " + target + " is: " + ans);
    // } else {
    //     System.out.println("No ceiling found!");
    // }

    if (ans != -1) {
      System.out.println("floor of " + target + " is: " + ans);
    } else {
      System.out.println("No floor found!");
    }

  }
}
