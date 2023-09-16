package Lecture9_LINKEDLIST2;

public class MidPointofLL {
    static int count(Node<Integer> head){
        int ans = 1;
        while(head.next!=null){
            ans++;
            head=head.next;
        }
        return ans;
    }
    static Node<Integer> Nodeatpos(Node<Integer> head , int pos){
        for(int i=0;i<pos;i++){
            head=head.next;
        }
        return head;
    }
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        int num = count(head)-1;
        return Nodeatpos(head,num/2);
    }

}
