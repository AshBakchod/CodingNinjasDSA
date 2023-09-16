package Lecture3_RECURSION1;

public class SumofDigits {
    public static int sumOfDigits(int input){
        // Write your code here
        int sum =0;
        int q=input/10;
        int r=input%10;
        if(q==0){
            sum+=r;
            return sum;
        }
        sum+=r;
        return sum+sumOfDigits(q);

    }
}
