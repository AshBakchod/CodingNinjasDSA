package Lecture3_RECURSION1;

public class SumofArray {

    public static int sum(int input[]) {
        int l = input.length;
        if(l==1){
            return input[0];
        }
        int[] arr = new int[l-1];
        for(int i=0;i<l-1;i++){
            arr[i]=input[i];
        }
        return input[l-1]+sum(arr);
    }
}
