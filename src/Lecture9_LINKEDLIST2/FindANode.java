package Lecture9_LINKEDLIST2;

public class FindANode {
    static int find(Node<Integer> head , int n , int i){
        if(head==null){
            return -1;
        }
        if(head.data==n){
            return i;
        }
        return find(head.next,n,i+1);
    }

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        return find(head,n,0);
    }

}
