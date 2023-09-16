package Lecture8_LINKEDLIST1;

public class PalindromeLL {
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
    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        if(head==null){
            return true;
        }
        int num = count(head);
        for(int i=0;i<num;i++){
            if(Nodeatpos(head,i).data!=Nodeatpos(head,num-1-i).data){
                return false;
            }
        }
        return true;
    }
}
