package Lecture8_LINKEDLIST1;

public class LengthofLL {
    public static int length(Node head){
        //Your code goes here
        if(head.next==null){
            return 1;
        }
        return 1 + length(head.next);
    }
}
