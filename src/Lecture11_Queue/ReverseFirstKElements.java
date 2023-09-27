package Lecture11_Queue;
import java.util.Queue;
public class ReverseFirstKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) { //import Queue at top;
        //Your code goes here
        int n = input.size();
        int[] arr1 = new int[k];
        int[] arr2 = new int[n-k];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=input.remove();
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j]=input.remove();
        }

        for(int i=arr1.length-1;i>=0;i--){
            input.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            input.add(arr2[j]);
        }
        return input;
    }

}
