package Lecture6_TIME_SPACE_COMPLEXITY;
import java.util.*;
public class DuplicateArray {
    //add import java.util.*; at top
    public static int[] mergesort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid = (arr.length)/2;
        int[] arr1 = Arrays.copyOfRange(arr,0,mid); //add import java.util.*; at top
        arr1 = mergesort(arr1);
        int[] arr2 = Arrays.copyOfRange(arr,mid,arr.length);
        arr2 = mergesort(arr2);

        int[] ans = new int[arr.length];
        int i=0,j=0;
        while( i<arr1.length && j<arr2.length){
            if(arr1[i] > arr2[j]){
                ans[i+j]=arr2[j];
                j++;
            }else {
                ans[i+j]=arr1[i];
                i++;
            }
        }
        if(i==arr1.length){
            for(;j<arr2.length;j++){
                ans[arr1.length+j]=arr2[j];
            }

        }else if (j==arr2.length){
            for(;i<arr1.length;i++){
                ans[arr2.length+i]=arr1[i];
            }
        }
        return ans;
    }

    public static int findDuplicate(int[] arr) {
        //Your code goes here
        // int val=0;
        //   for (int i=0;i<arr.length;i++)
        //   {
        //       val=val+arr[i];
        //   }
        //   return val-((arr.length-2)*(arr.length-1)/2);
        int[] sarr = mergesort(arr);
        for(int i=1;i<sarr.length;i++){
            if(sarr[i]==sarr[i-1]){
                return sarr[i];
            }
        }
        return sarr[0];
    }
}
