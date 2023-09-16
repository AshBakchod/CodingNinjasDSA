package Lecture4_RECURSION2;

public class PrintKeyPad {
    public static String[] keypad(int n){
        String[][] legend = {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        if(n/10==0){
            return legend[n-2];
        }
        String[] small = keypad(n/10);
        String [] big = legend[(n%10)-2];
        String [] ans = new String[small.length*big.length];
        for(int i=0,k=0;i<big.length;i++){
            for(int j=0;j<small.length;j++,k++){
                ans[k] = small[j] + big[i];
            }
        }
        return ans;
    }
    public static void printKeypad(int input){
        String [] ans = keypad(input);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
