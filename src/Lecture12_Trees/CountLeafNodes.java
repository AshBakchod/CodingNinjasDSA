package Lecture12_Trees;

public class CountLeafNodes {
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        } else if (root.children.size()==0) {
            return 1;
        }

        int ans=0;
        for(int i=0;i<root.children.size();i++){
            ans+=countLeafNodes(root.children.get(i));
        }
        return ans;
    }

}
