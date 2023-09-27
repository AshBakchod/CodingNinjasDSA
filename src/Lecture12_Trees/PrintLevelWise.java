package Lecture12_Trees;
import java.util.*;
public class PrintLevelWise {
    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if(root == null)
            return;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode<Integer> node = q.poll();
            if(node != null)
            {
                System.out.print(node.data + " ");
                for(int i=0; i<node.children.size(); i++)
                    q.add(node.children.get(i));
            }
            else{
                System.out.println();
                if(!q.isEmpty())
                    q.add(null);
            }
        }

    }
}
