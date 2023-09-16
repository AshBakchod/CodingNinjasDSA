package Lecture9_LINKEDLIST2;

public class ReverseLL {
    static Node<Integer> rev(Node<Integer> head , int k){
        if(k==2){
            int h1=head.data;
            head.data=head.next.data;
            head.next.data=h1;
            return head;
        }else if (k==1){
            return head;
        }
        int h1 = head.data;
        Node<Integer> temp = head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        head.data=temp.data;
        temp.data=h1;
        rev(head.next,k-2);
        return head;

    }
    static int count(Node<Integer> head){
        int ans = 0;
        while(head.next!=null){
            head=head.next;
            ans++;
        }
        return ++ans;
    }
    public static Node<Integer> reverse_I(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        return rev(head,count(head));
    }
}
