import java.util.Stack;
//orignal =  "8+(2-2)+4*2/2"
// Prefix Expression: ++8-22/*422
// Postfix Expression: 822-+42*2/+
public class postfix_to_prefix {
  public static void main(String[] args) {
    Stack<String> prefix = new Stack<>();
    String postfix = "822-+42*2/+";

    for(int i =0;i<postfix.length();i++)
    {
      char ch = postfix.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57) {
        String s = "" + ch;
        prefix.push(s);
      } else {
        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String s = ch+ v1 + v2;
        prefix.push(s);
      }

    }
    System.out.println("infix to prefix convesion is "+prefix.peek());
  }
  
}
  
