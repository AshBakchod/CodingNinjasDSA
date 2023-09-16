package Lecture3_RECURSION1;

public class NumberofDigits {
    public static int count(int n){
        //Write your code here
        if(n==0){
            return 0;
        }
        int q = n/10;
        int r = n%10;
        if(q==0){
            return 1;
        }
        int ans =1;
        ans = ans + count(n/10);
        return ans;
    }
}
