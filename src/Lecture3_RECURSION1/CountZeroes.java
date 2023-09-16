package Lecture3_RECURSION1;

public class CountZeroes {
    public static int countZerosRec(int input){
        if(input==0){
            return 1;
        }
        int q = input/10;
        int r = input%10;
        int ans=0 ;
        if(q==0){
            return 0;
        }else if(r==0){
            ans++;
        }
        return ans + countZerosRec(input/10);
    }
}
