package Lecture12_Trees;
import java.util.*;
public class TreeNode <T>{
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}
