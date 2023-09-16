package Lecture9_LINKEDLIST2;

public class SwapTwoNodes {
    static Node<Integer> Nodeatpos(Node<Integer> head , int pos){
        if(head.next==null){
            return head;
        }
        for(int i=0;i<pos;i++){
            head=head.next;
        }
        return head;
    }

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        Node<Integer> node1 = Nodeatpos(head,i);
        Node<Integer> node2 = Nodeatpos(head,j);
        int t= node1.data;
        node1.data=node2.data;
        node2.data=t;
        return head;
    }
}
