package Lecture8_LINKEDLIST1;

public class DeleteNode {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
        // Write your code here.
        if(head==null){
            return head;
        }
        Node<Integer> temp = head;
        if(pos==0){
            return head.next;
        }
        int i = 1;
        while (temp.next!=null){
            if(i==pos){
                temp.next=temp.next.next;
                break;
            }
            i++;
            temp=temp.next;
        }
        return head;
    }
}
