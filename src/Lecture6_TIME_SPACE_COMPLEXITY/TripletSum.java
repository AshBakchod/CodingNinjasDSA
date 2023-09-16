package Lecture6_TIME_SPACE_COMPLEXITY;

public class TripletSum {
    public static int[] bubbleSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        return arr;
    }

    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        arr = bubbleSort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;

            int start = i + 1;
            int stop = n - 1;

            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }

                    int tempI = start + 1;
                    int tempJ = stop - 1;

                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }

                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }

                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;

                    numPairs += (totalElementFromStart * totalElementFromEnd);

                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;

    }
}
