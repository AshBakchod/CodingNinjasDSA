package Lecture3_RECURSION1;

public class PrintNumbers {
    public static void print(int n){
        //Write your code here
        if(n==1){
            System.out.print(1);
            return;
        }
        print(n-1);
        System.out.print(" "+n);
    }
}
