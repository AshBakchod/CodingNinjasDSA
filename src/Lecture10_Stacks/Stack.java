package Lecture10_Stacks;

public class Stack {
    private int size = 0;
    private Node tail = new Node(-1);
    private Node head;

    public Stack() {
        //Implement the Constructor
        head=tail;
        tail.next=null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size==0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newhead = new Node(element);
        newhead.next=head;
        head=newhead;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(head==null || head.next==null){
            return -1;
        }
        int ans = head.data;
        head=head.next;
        size--;
        return ans;
    }

    public int top(){
        //Implement the top() function
        if(head==null || head.next==null){
            return -1;
        }else{
            return head.data;
        }
    }
}
