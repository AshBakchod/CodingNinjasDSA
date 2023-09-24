package Lecture10_Stacks;

public class BalancedParanthesis {
    public static boolean isBalanced(String expression) {
        //Your code goes here
        if(expression.length()==0){
            return true;
        }
        int ans = 0;
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='('){
                ans++;
            } else if (expression.charAt(i)==')') {
                ans--;
            }if(ans<0){
                return false;
            }
        }
        return (ans==0);
    }
}
