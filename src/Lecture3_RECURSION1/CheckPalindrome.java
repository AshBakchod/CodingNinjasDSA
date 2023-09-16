package Lecture3_RECURSION1;

public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        int n = input.length();
        if(n<=1){
            return true;
        }
        else if(input.charAt(0)!=input.charAt(n-1)){
            return false;
        }
        String small = "";
        for(int i =1;i<n-1;i++){
            small = small+input.charAt(i);
        }
        boolean ans = isStringPalindrome(small);
        return ans;

    }
}
