package Lecture4_RECURSION2;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        String ans = "";
        int l = s.length();
        if(l<=1){
            return s;
        }
        for(int i=0;i<l-1;i++){
            ans = ans + s.charAt(i);
        }
        if(s.charAt(l-2)!=s.charAt(l-1)){
            return removeConsecutiveDuplicates(ans) + s.charAt(l-1);
        }
        return removeConsecutiveDuplicates(ans);
    }
}
