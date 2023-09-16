package Lecture9_LINKEDLIST2;

public class MergeSort {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if (head1==null)
        {
            return head2;
        }

        if (head2==null)
        {
            return head1;
        }

        Node<Integer> newHead=null,node1=head1,node2=head2,newNode=null;
        int data1=node1.data,data2=node2.data;
        if (data1<data2)
        {
            newHead=node1;
            node1=node1.next;
        }
        else
        {
            newHead=node2;
            node2=node2.next;
        }
        newNode=newHead;
        while(node1!=null && node2!=null)
        {
            data1=node1.data;
            data2=node2.data;
            if (data1<data2)
            {
                newNode.next=node1;
                newNode=newNode.next;
                node1=node1.next;
            }
            else
            {
                newNode.next=node2;
                newNode=newNode.next;
                node2=node2.next;
            }
        }

        while(node1!=null)
        {
            newNode.next=node1;
            newNode=newNode.next;
            node1=node1.next;
        }
        while (node2!=null)
        {
            newNode.next=node2;
            newNode=newNode.next;
            node2=node2.next;
        }
        return newHead;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {
        //Your code goes here
        //Handling base case where length of linked is 0 or 1
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> midNode=midPoint(head),part1Head=head,part2Head=null;
        part2Head=midNode.next;
        midNode.next=null;
        Node<Integer> head1=mergeSort(part1Head);
        Node<Integer> head2=mergeSort(part2Head);
        Node<Integer> newHead=mergeTwoSortedLinkedLists(head1,head2);
        return newHead;
    }
}
