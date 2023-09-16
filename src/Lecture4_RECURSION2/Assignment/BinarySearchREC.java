package Lecture4_RECURSION2.Assignment;

public class BinarySearchREC {
    private static int search(int[] arr,int strt,int end,int target){
        if(strt>end){
            return -1;
        }
        int mid = (strt+end)/2;
        if(arr[mid]<target){
            strt = mid+1;
            return search(arr,strt,end,target);
        }else if (arr[mid]>target){
            end = mid-1;
            return search(arr,strt,end,target);
        }
        return mid;
    }
    public static int binarySearch(int input[], int element) {
        // Write your code here
        if(input.length==0){
            return -1;
        }
        int ans = search(input,0,input.length-1,element);
        return ans;
    }

}
