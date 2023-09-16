package Lecture4_RECURSION2;

public class TowerofHanoi {
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        // Write your code here
        if(n==0){
            return;
        }
        if (n == 1) {
            System.out.println( source+" "+destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println( source +" "+ destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);

    }
}
