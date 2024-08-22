package linkedlist;

public class LL {

    private node head;
    private node tail;
    private int size;

    public LL()
    {
        this.size=0;

    }
    public void insertFirst(int val)
    {
        node a = new node(val);
        a.next=head;
        head=a;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;

    }
    public void insertlast(int val)
    {  if(tail==null)
        {
            insertFirst(val);
            return;
        }
        node a = new node(val);
        tail.next=a;
        tail=a;
        size+=1;

    }

    public void insert(int val , int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertlast(val);
            return;
        }
        node temp = head;
        for(int i=1;i<index;i++)
        {
            temp =temp.next;
        }
        node a = new node(val,temp.next);
        temp.next=a;
    }
    public void display(){
        node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.value +"->");
            temp =temp.next;

        }
        System.out.print("end");

    }
    private class node {
    private int value;
    private node next;

    public node(int value, node next) {
        this.value = value;
        this.next = next;
    }
    public node(int value)
    {
        this.value=value;

    }
    
        
    }

    
}
