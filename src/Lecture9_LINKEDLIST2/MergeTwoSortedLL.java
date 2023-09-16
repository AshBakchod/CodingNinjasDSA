package Lecture9_LINKEDLIST2;

public class MergeTwoSortedLL {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null){
            return head2;
        } else if (head2==null) {
            return head1;
        }
        Node<Integer> temp = new Node<>(Math.min(head1.data,head2.data));
        Node<Integer> ans = temp;
        if(head1.data<=head2.data){
            // temp=head1;
            head1=head1.next;
        }else if (head2.data<head1.data){
            //temp=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                Node<Integer> temp1=head1;
                temp.next=temp1;
                head1=head1.next;
            }else{
                Node<Integer>temp1=head2;
                temp.next=temp1;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1==null){
            temp.next=head2;
        }else{
            temp.next=head1;
        }
        return ans;
    }
}
