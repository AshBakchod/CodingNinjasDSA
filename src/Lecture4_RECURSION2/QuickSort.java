package Lecture4_RECURSION2;

public class QuickSort {
    public static int BinarySearch(int[] arr, int target){
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
    public static void quickSort(int[] arr , int strt , int end){
        if(strt>=end){
            return;
        }
        int pivot = arr[(strt+end+1)/2];
        int i=strt,j=end;

        while(i<=j){
            if(arr[j]<pivot && pivot>arr[i]){
                i++;
                continue;
            }else if (arr[j]>pivot && pivot<arr[i]) {
                j--;
                continue;
            }else if(arr[j]<=pivot && pivot<=arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
                continue;
            }
            i++;
            j--;
        }
        int mid = BinarySearch(arr,pivot);
        quickSort(arr,strt,mid-1);
        quickSort(arr,mid+1,end);
    }
}
