
import java.util.Stack;


class infix_to_prefix_expression {
  public static void main(String[] args) {
    Stack<String> num = new Stack<>();
    Stack<Character> op = new Stack<>();
    String str = "8+(2-2)+4*2/2";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isDigit(ch)) {
        num.push(String.valueOf(ch));
      } else if (ch == '(') {
        op.push(ch);
      } else if (ch == ')') {
        while (!op.isEmpty() && op.peek() != '(') {
          String v2 = num.pop();
          String v1 = num.pop();
          char operator = op.pop();
          String result = operator + v1 + v2;
          num.push(result);
        }
        op.pop(); // Pop the '('
      } else { // Operator
        while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
          String v2 = num.pop();
          String v1 = num.pop();
          char operator = op.pop();
          String result = operator + v1 + v2;
          num.push(result);
        }
        op.push(ch);
      }
    }

    while(!op.isEmpty()) {
      String v2 = num.pop();
      String v1 = num.pop();
      char operator = op.pop();
      String result = operator + v1 + v2;
      num.push(result);
    }
    System.out.println("Prefix Expression: " + num.peek());
  }
  public static int precedence(char operator) {
      return switch (operator) {
          case '+', '-' -> 1;
          case '*', '/' -> 2;
          default -> 0;
      }; // For '(' or any other character
  }
}