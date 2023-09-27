package Lecture11_Queue;
import java.util.Queue;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) { //import Queue at the top
        int n = input.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.remove();
        }
        for(int i=n-1;i>=0;i--){
            input.add(arr[i]);
        }
    }

}
