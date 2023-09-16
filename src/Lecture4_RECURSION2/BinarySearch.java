package Lecture4_RECURSION2;

public class BinarySearch {
    public static int search(int []arr, int target) {
        for(int strt = 0, end = arr.length-1;strt<=end;){
            int mid = (strt+end)/2;
            if(arr[mid]>target){
                end=mid-1;
                continue;
            } else if (arr[mid]<target) {
                strt=mid+1;
                continue;
            }
            return mid;
        }
        return -1;
    }
}
