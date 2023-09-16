package Lecture4_RECURSION2.Assignment;

public class ReturnAllCodes {
    private static int helper(String str){
        int ans = 0;
        for(int i=0,n=str.length()-1;i<str.length();i++,n--){
            ans += (str.charAt(i) - 48)*Math.pow(10,n);
        }
        return ans;
    }

    // Return a string array that contains all possible codes
    private static String[] retcode(int n){
        if(n==0){
            String[] ans = {""};
            return ans;
        }
        if(n/10==0){
            String[] ans = new String[1];
            ans[0] = "";
            ans[0] += (char)(n+96);
            return ans;
        }
        int num2 = n%100;
        String [] smallans2 = retcode(n/100);
        for(int i=0;i<smallans2.length;i++){
            smallans2[i] +=  (char)(num2+96);
        }

        int small = n/10;
        int num1 = n%10;
        String [] smallans1 = retcode(n/10);
        for(int i=0;i<smallans1.length;i++){
            smallans1[i] +=  (char)(num1+96);
        }
        if(n%100>26){
            return smallans1;
        }
        String[] ans = new String[smallans1.length+smallans2.length];
        for(int i=0;i<smallans1.length;i++){
            ans[i] = smallans1[i];
        }
        for(int i=smallans1.length;i<ans.length;i++){
            ans[i] = smallans2[i-smallans1.length];
        }
        return ans;
    }
    public static  String[] getCode(String str){
        int num = helper(str);
        return retcode(num);
    }
}
