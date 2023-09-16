package Lecture9_LINKEDLIST2;

public class BubbleSort {
    static int count(Node<Integer> head){
        int ans = 0;
        while(head.next!=null){
            head=head.next;
            ans++;
        }
        return ++ans;
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        //Your code goes here
        if( head==null){
            return null;
        }
        Node<Integer> ans = head;
        int n = count(head);
        Node<Integer> t = head;
        for(int i=0;i<n;i++){
            head=t;
            for(int j=0;j<n-i-1;j++){
                if(head.data>=head.next.data){
                    int temp=head.data;
                    head.data=head.next.data;
                    head.next.data=temp;
                }
                head=head.next;
            }
        }
        return ans;
    }

}
