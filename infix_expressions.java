import java.util.Stack;
public class infix_expressions {
  public static void main(String[] args) {
    String str = "8+2-4*2/2";
    

    //using to stack one for integer 1 for operator
    Stack<Integer> num = new Stack<>();
    Stack<Character> op = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57)
        num.push(ascii - 48);
      else if (op.isEmpty())
        op.push(ch);
      else {
        if (ch == '+' || ch == '-') {
          int v2 = num.pop();
          int v1 = num.pop();
          if (op.peek() == '-')
            num.push(v1 - v2);
          if (op.peek() == '+')
            num.push(v1 + v2);
          if (op.peek() == '*')
            num.push(v1 * v2);
          if (op.peek() == '/')
            num.push(v1 / v2);
          op.pop();
          op.push(ch);
        }
        if (ch == '*' || ch == '/') {
          if (op.peek() == '*' || op.peek() == '/') {
            int v2 = num.pop();
            int v1 = num.pop();
            if (op.peek() == '*')
              num.push(v1 * v2);
            if (op.peek() == '/')
              num.push(v1 / v2);
            op.pop();
            op.push(ch);
          } else {
            op.push(ch);
          }
        }
      }

    }
    
    // num stack size -> 1
    //check
    while(num.size()>1)
    {

      int v2 = num.pop();
      int v1 = num.pop();
      if (op.peek() == '-')
        num.push(v1 - v2);
      if (op.peek() == '+')
        num.push(v1 + v2);
      if (op.peek() == '*')
        num.push(v1 * v2);
      if (op.peek() == '/')
        num.push(v1 / v2);
      op.pop();

    }
    System.out.println(num.peek());

  }
}
