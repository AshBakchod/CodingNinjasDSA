package Lecture10_Stacks;

public class CheckRedundantBrackets {
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


    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack stack=new Stack();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            //System.out.print(c);

            if (c==')')
            {
                //System.out.println();
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                //System.out.println();
                //System.out.println(count);
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;

            }
            else
            {
                stack.push(c);
            }
        }
        return false;

    }
}
