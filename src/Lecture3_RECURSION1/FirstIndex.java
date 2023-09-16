package Lecture3_RECURSION1;

public class FirstIndex {
    public static int firstIndex(int input[], int x) {
        int l = input.length;
        for(int i=0;i<l;i++){
            if(input[i]==x){
                return i;
            }
        }
        return -1;
    }
}
