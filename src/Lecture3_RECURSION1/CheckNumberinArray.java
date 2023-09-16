package Lecture3_RECURSION1;

public class CheckNumberinArray {
    public static boolean checkNumber(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int l = input.length;
        if(input[l-1]==x){
            return true;
        }
        else if(l==1){
            return false;
        }
        int[] arr = new int[l-1];
        for(int i=0;i<l-1;i++){
            arr[i]=input[i];
        }
        return checkNumber(arr, x);
    }
}
