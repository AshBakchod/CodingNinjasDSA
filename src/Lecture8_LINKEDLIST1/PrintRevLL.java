package Lecture8_LINKEDLIST1;

public class PrintRevLL {
    public static void printReverse(Node<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        if(root.next==null){
            System.out.print(root.data + " ");
            return;
        }
        printReverse(root.next);
        System.out.print(root.data + " ");
    }

}
