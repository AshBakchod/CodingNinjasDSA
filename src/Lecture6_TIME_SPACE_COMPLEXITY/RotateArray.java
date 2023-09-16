package Lecture6_TIME_SPACE_COMPLEXITY;

public class RotateArray {
    private static int[] giveans(int[] arr , int d){
        int[] ans = new int[arr.length];
        for(int i=d;i<arr.length;i++){
            ans[i-d] = arr[i];
        }
        for(int i = arr.length-d;i<arr.length;i++){
            ans[i] = arr[i-(arr.length-d)];
        }
        return ans;
    }

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int[] ans = giveans(arr,d);
        for(int i =0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
}
