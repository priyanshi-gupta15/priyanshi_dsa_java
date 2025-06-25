import java.util.Stack;
//orignal =  "8+(2-2)+4*2/2"
// Prefix Expression: ++8-22/*422
// Postfix Expression: 822-+42*2/+
public class prefix_to_postfix {
  public static void main(String[] args) {
    Stack<String> post = new Stack<>();
    String prefix = "++8-22/*422";

    for(int i =prefix.length()-1;i>=0;i--)
    {
      char ch = prefix.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57) {
        String s = "" + ch;
        post.push(s);
      } else {
        String v1 = post.pop();
        String v2 = post.pop();
        String s = v1 + v2 + ch;
        post.push(s);
      }

    }
    System.out.println("infix to postfix convesion is "+post.peek());
  }
  
}