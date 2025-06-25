import java.util.LinkedList;
import java.util.Queue;

public class Binary_tree_traversal {

  public static class Node {
    Node left;
    Node right;//null
    int val; //0

    public Node(int val) {
      this.val = val;
      left = right = null;
    }
  }

  // ***********depth first search technique ****************

  public static void preorder(Node root)
  {
    // Preorder Traversal (Root → Left → Right):
    if (root == null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);

  }
  
  public static void inorder(Node root)
  {
    // Inorder Traversal (Left → Root → Right):
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
  }
  
  public static void postorder(Node root)
  {
    // Postorder Traversal (Left → Right → Root):
    if (root == null)
      return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");

  }
  // level order traversal  *************** breadth first serch technique**********
  
  public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);
        }
    }
  
  public static void display(Node root)
  {
    if (root == null)
      return;
    System.out.print(root.val + "->");
    if(root.left !=null)System.out.print(root.left.val+",");
    if (root.left != null)
      System.out.println(root.right.val);
    else {
      System.out.println();
    }
   
    display(root.left);
    display(root.right);
  }

  public static void main(String[] args) {
  


//                tree
//                 10
//               /    \
//              20     30
//             / \     / \
//            40  50  60  70
//           /  \
//          80  90
   Node root = new Node(10);
   Node a = new Node(20);
   Node b = new Node(30);
   root.left = a;
   root.right = b;
   Node c = new Node(40);
   Node d = new Node(50);
   a.left = c;
   a.right = d;
   Node e = new Node(60);
   Node f = new Node (70);
   b.left = e;
   b.right = f;
   Node g = new Node(80);
   Node h = new Node(90);
   c.left = g;
   c.right = h;

   // System.out.println(root.right.val);
  //  display(root);
  

       System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        System.out.print("level order traversal using queue: ");
        levelOrder(root);
        System.out.println();
 }
  
}
