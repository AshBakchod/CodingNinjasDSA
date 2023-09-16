package Lecture4_RECURSION2;
import java.util.*;
public class MergeSort {
   //add import java.util.*; at top
    public static int[] mergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid = (arr.length)/2;
        int[] arr1 = Arrays.copyOfRange(arr,0,mid);
        arr1 = mergeSort(arr1);
        int[] arr2 = Arrays.copyOfRange(arr,mid,arr.length);
        arr2 = mergeSort(arr2);

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
}
