package Lecture8_LINKEDLIST1;

public class FindaNode {
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        if(head==null){
            return -1;
        }else if(head.data==n){
            return 0;
        }
        int m = findNode(head.next, n);
        if(m==-1){
            return -1;
        }
        return 1+ m;
    }
}
