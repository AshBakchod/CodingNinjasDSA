package Lecture9_LINKEDLIST2;

public class DeleteEveryNNodes {
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
            if(head==null){
                return null;
            }
            head=head.next;
        }
        return head;
    }
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {
        //Your code goes here
        if(head==null){
            return null;
        }
        if(m==0){
            return null;
        }else if (n==0) {
            return head;
        }
        int num = count(head);
        Node<Integer> ans = head;
        num-=m;
        if(num<=0){
            return ans;
        }
        Node<Integer> temphead=Nodeatpos(head,m-1);

        while(num>0){
            num-=n;
            // if(num<=0){
            //  return ans;
            // }
            temphead.next=Nodeatpos(temphead,n+1);
            temphead=temphead.next;
            num-=m;
            if(num<=0){
                return ans;
            }
            temphead=Nodeatpos(temphead,m-1);
        }

        return ans;
    }
}
