package Lecture4_RECURSION2.Assignment;

public class StairCase {
    public static int staircase(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return staircase(n-1) + staircase(n-2) + staircase(n-3);

    }

}
