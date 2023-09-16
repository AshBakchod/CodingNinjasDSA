package Lecture3_RECURSION1;

public class GeometricSum {
    public static double findGeometricSum(int k){
        // Write your code here
        double ans =1;
        if(k==0){
            return 1;
        }
        for(int i=0;i<k;i++){
            ans*=0.5;
        }
        return ans + findGeometricSum(k-1);
    }
}
