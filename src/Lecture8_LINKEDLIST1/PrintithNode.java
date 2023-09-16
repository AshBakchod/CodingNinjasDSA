package Lecture8_LINKEDLIST1;

public class PrintithNode {
    public static void printIthNode(Node<Integer> head, int i){
        if(head==null){
            System.out.println();
            return;
        }
        int temp = 0;
        while(head!=null){
            temp++;
            head=head.next;
            if(temp==i){
                System.out.println(head.data);
                return;
            }
        }
    }
}
