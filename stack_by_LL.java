

public class stack_by_LL {
  public static void main(String[] args) {
    LL stack = new LL();
    stack.push(3);
    stack.push(4);
    stack.push(6);
    stack.push(5);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    stack.print();
    System.out.println(stack.isEmpty());
  }

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  static class LL {
    private Node top;

    //constructor 
    LL()
    {
      this.top = null;
    }
    //push
    public void push(int val)
    {
      Node head = new Node(val);
      head.next = top;
      top = head;
    }
    //pop
    public int pop() {
      if (isEmpty()) {
          System.out.println("Stack Underflow!");
          return -1;
      }
      int value = top.data;
      top = top.next;
      return value;
  }
  //isempty
  public boolean  isEmpty()
  {
    return top == null;
   }
   //peek
   public int peek() {
     if (isEmpty()) {
       System.out.println("Stack Underflow!");
       return -1;
     }
     int value = top.data;
     return value;
   }
   //print
  public void print()
  {
    Node temp = top;
    while (temp != null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println();

  }
  
  }
  
}
