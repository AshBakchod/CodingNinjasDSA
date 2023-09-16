package Lecture8_LINKEDLIST1;

public class AppendLAstNtoFirst {
    static int count(Node<Integer> head){
        int ans = 1;
        while(head.next!=null){
            ans++;
            head=head.next;
        }
        return ans;
    }
    static Node<Integer> end(Node<Integer> head){
        while(head.next!=null){
            head=head.next;
        }
        return head;
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if(head==null){
            return head;
        }
        //Your code goes here
        int num = count(head);
        Node<Integer> temp = head;
        for(int i=1;i<num-n;i++){
            temp=temp.next;
        }
        Node<Integer>mid = end(head);
        mid.next=head;
        Node<Integer> ans = temp.next;
        temp.next=null;
        return ans;
    }
}
