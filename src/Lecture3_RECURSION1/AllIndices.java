package Lecture3_RECURSION1;

public class AllIndices {
    public static int[] allIndexes(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int j=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==x){
                //ans[j]=i;
                j++;
            }
        }
        int[] ans = new int[j];
        for(int m=0,n=0;m<input.length;m++){
            if(input[m]==x){
                ans[n]=m;
                n++;
            }
        }
        return ans;

    }
}
