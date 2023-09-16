package Lecture8_LINKEDLIST1;

public class EliminateDuplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> uniqueNode=head.next,node=head;

        while (uniqueNode!=null)
        {
            //System.out.println("Current uniqueNode data: " + uniqueNode.data);
            //System.out.println("Current node data: "+ node.data);
            if (!(uniqueNode.data).equals(node.data))
            {
                //System.out.println("Adding uniqueNode to the updated linkedlist");
                node.next=uniqueNode;
                node=node.next;
                //Runner.print(head);
            }
            uniqueNode=uniqueNode.next;
            //System.out.println();
        }
        node.next=uniqueNode;

            /*LinkedListNode<Integer> node=head;
        	while(node.next!=null)
        	{
            	if(node.data==node.next.data)
            	{
                	node.next=node.next.next;
            	}
            	else
                {
            		node=node.next;
            	}
        	}*/

        return head;
    }

}
