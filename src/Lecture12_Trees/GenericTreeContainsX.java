package Lecture12_Trees;

public class GenericTreeContainsX {
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root.data==x){
            return true;
        }
        for(int i=0;i<root.children.size();i++){
            if(checkIfContainsX(root.children.get(i), x)==true){
                return true;
            }
        }
        return false;
    }
}
