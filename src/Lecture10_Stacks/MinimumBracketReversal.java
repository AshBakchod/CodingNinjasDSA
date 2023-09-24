package Lecture10_Stacks;

public class MinimumBracketReversal {
    public static class Stack {
        class Node {
            char data;
            Node next;

            public Node(char data) {
                this.data = data;
            }

        }

        // private int data;
        private int size = 0;
        private Node tail = new Node('i');
        private Node head;

        public Stack() {
            //Implement the Constructor
            head=tail;
            tail.next=null;
        }



        /*----------------- Public Functions of Stack -----------------*/


        public int getSize() {
            //Implement the getSize() function
            return size;
        }

        public boolean isEmpty() {
            //Implement the isEmpty() function
            return (size==0);
        }

        public void push(char element) {
            //Implement the push(element) function
            Node newhead = new Node(element);
            newhead.next=head;
            head=newhead;
            size++;
        }

        public char pop() {
            //Implement the pop() function
//        if(head==null || head.next==null){
//            return -1;
//        }

            char ans = head.data;
            head=head.next;
            size--;
            return ans;
        }

        public char peek(){
            //Implement the top() function
//        if(head==null || head.next==null){
//            return -1;
//        }else{
            return head.data;

        }
    }


    public static int countBracketReversals(String input) {
        //Your code goes here
        if (input.length()%2!=0)
        {
            return -1;
        }
        Stack stack=new Stack();
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if (c=='{')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    stack.push(c);
                }
                else if (stack.peek()=='}')
                {
                    stack.push(c);
                }
                else if (stack.peek()=='{')
                {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty())
        {
            char c1=stack.pop();
            char c2=stack.pop();

            if (c1==c2)
            {
                count=count+1;
            }
            else
            {
                count=count+2;
            }
        }
        return count;
    }
}
