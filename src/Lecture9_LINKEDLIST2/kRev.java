package Lecture9_LINKEDLIST2;

public class kRev {
    static int count(Node<Integer> head){
        int ans = 0;
        while(head.next!=null){
            head=head.next;
            ans++;
        }
        return ++ans;
    }
    static Node<Integer> Nodeatpos(Node<Integer> head , int pos){
        if(head.next==null){
            return head;
        }
        for(int i=0;i<pos;i++){
            head=head.next;
        }
        return head;
    }
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
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        //Your code goes here
        int num = count(head);
        Node<Integer> ans= head;
        for(int i=0;i<num;i+=k){
            if(num-i<k){
                head=Nodeatpos(ans,i);
                head=rev(head,num-i);
                break;
            }
            head=Nodeatpos(ans,i);
            head=rev(head,k);
        }
        return ans;
    }
}
