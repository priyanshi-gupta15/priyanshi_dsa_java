import java.util.Stack;
//orignal =  "8+(2-2)+4*2/2"
// Prefix Expression: ++8-22/*422
// Postfix Expression: 822-+42*2/+
public class postfix_to_infix {
  public static void main(String[] args) {
    Stack<String> infix = new Stack<>();
    String postfix = "822-+42*2/+";

    for(int i =0;i<postfix.length();i++)
    {
      char ch = postfix.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57) {
        String s = "" + ch;
        infix.push(s);
      } else {
        String v2 = infix.pop();
        String v1 = infix.pop();
        String s = "(" + v1 +ch+ v2 + ")";
        infix.push(s);
      }

    }
    System.out.println("infix to infix convesion is "+infix.peek());
  }
  
}
  

  
