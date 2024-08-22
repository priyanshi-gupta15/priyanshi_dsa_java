package linkedlist;


public class Main {
    public static void main(String[] args) {
    //    LinkedList<Integer> list = new LinkedList<>();
    //    list.add(34);
    //    list.add(9);
    //    list.add(5);
    //    list.add(6);
    //    list.add(35);
    LL list = new LL();
    list.insertFirst(3);
    list.insertFirst(4);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(1);
    list.insertlast(0);
    list.insert(2, 3);
    list.display();

    }
    
}
