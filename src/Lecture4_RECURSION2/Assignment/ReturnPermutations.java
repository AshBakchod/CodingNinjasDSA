package Lecture4_RECURSION2.Assignment;

public class ReturnPermutations {
    private static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }

    public static String[] permutationOfString(String str){
        // Write your code here
        int n = str.length();
        if(n<=1){
            String[] ans = new String[1];
            ans[0] = str;
            return ans;
        }
        else if(n==2){
            String[] ans = new String[2];
            ans[0] = str;
            ans[1] = "";
            ans[1] = ans[1]+ str.charAt(1) + str.charAt(0);
        }
        String[] ans = new String[fac(n)];
        for(int i=0;i<str.length();i++){
            String[] smallans = permutationOfString(str.substring(0,i-0)+str.substring(i+1));
            for(int j=0,index=i*fac(n-1);j<fac(n-1);j++,index++){
                ans[index] = str.charAt(i)+smallans[j];
            }
        }
        return ans;
    }

}
