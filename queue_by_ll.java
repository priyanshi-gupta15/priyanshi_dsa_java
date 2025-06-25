public class queue_by_ll {
  
  public static void main(String[] args) {
    LL queue = new LL();
    queue.push(3);
    System.out.println();
    queue.push(4);
    queue.push(6);
    queue.push(5);
    System.out.println(queue.peek());
    System.out.println(queue.pop());
    System.out.println(queue.peek());
    queue.print();
    System.out.println(queue.isEmpty());
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
    private Node head;
    private Node tail;

    //constructor 
    LL()
    {
      this.head = null;
      this.tail = null;
    }
    //push
    public void push(int val)
    {
      Node newnode = new Node(val);
      if(tail==null)
      {
        //empty queue
        head = tail = newnode;
      }
      else {
        tail.next = newnode;
        tail = newnode;
      }
    }
    //pop
    public int pop() {
      if (isEmpty()) {
          System.out.println("quque Underflow!");
          return -1;
      }
      int value = head.data;
      head = head.next;
      if (head == null)
      {
        tail = null;
      }
      return value;
  }
  //isempty
  public boolean  isEmpty()
  {
    return head == null;
   }
   //peek
   public int peek() {
     if (isEmpty()) {
       System.out.println("empty quque!");
       return -1;
     }
     int value = head.data;
     return value;
   }
   //print
  public void print()
  {
    Node temp = head;
    while (temp != null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println();

  }
  
  }
  
}

