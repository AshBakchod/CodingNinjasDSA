package Lecture11_Queue;

public class Queue {
    private Node head;
    private Node tail;
    private int size=0;



    public Queue() {
        //Implement the Constructor
        head=tail;
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


    public void enqueue(int data) {
        if(size==0){
            head=new Node(data);
            tail=head;
            size++;
        }
        //Implement the enqueue(element) function
        else{
            Node newtail = new Node(data);
            tail.next=newtail;
            tail=tail.next;
            size++;
        }
    }


    public int dequeue() {
        //Implement the dequeue() function
        if(size==0){
            return -1;
        }
        int ans = head.data;
        head=head.next;
        size--;
        return ans;
    }


    public int front() {
        //Implement the front() function
        if(size==0){
            return -1;
        }
        return head.data;
    }

}
