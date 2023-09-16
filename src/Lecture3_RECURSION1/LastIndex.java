package Lecture3_RECURSION1;

public class LastIndex {
    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int l = input.length;
        for(int i=l-1;i>=0;i--){
            if(input[i]==x){
                return i;
            }
        }
        return -1;
    }
}
