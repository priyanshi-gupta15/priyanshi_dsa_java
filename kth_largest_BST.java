import java.util.Stack;

public class kth_largest_BST {

  public static class Node {
    Node left;
    Node right;
    int val;

    public Node(int val) {
      left = right = null;
      this.val = val;
    }
  }

  public static int kthlargest(Node root,int k)
  {
    int num = 0;
    Stack<Node> st = new Stack<>();

    while (true) {
       if(root!=null)
       {
         st.push(root);
         root = root.right;
       }
       else {
        if(st.isEmpty())
        {
          break;
        }
        root = st.pop();
        num++;
        if (num == k) return root.val;
        root = root.left;
      }
       
    }

    return -1;


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

    System.out.println(kthlargest(root, 575t6));
    
  }
  
}
