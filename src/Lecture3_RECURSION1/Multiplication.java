package Lecture3_RECURSION1;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        int ans =0;
        if(n==0){
            return 0;
        }
        ans+=m;
        return ans+multiplyTwoIntegers(m, n-1);

    }
}
