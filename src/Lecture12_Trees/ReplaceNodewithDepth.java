package Lecture12_Trees;

public class ReplaceNodewithDepth {
    static void replacedepth(TreeNode<Integer> root , int depth){
        for(int i=0;i<root.children.size();i++){
            root.children.get(i).data=depth;
            replacedepth(root.children.get(i),depth+1);
        }
    }
    public static void replaceWithDepthValue(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        root.data=0;
        int depth=1;
        for(int i=0;i<root.children.size();i++){
            root.children.get(i).data=depth;
            replacedepth(root.children.get(i),depth+1);
        }
    }


}
