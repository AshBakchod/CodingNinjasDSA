package Lecture4_RECURSION2.Assignment;

public class ReturnSubsetsSumtoK {
    private static int[][] findsubset(int[] arr,int index){
        //BaseCondition
        if(index==arr.length){
            int[][] ans = {{}};
            return ans;
        }
        int[][] smallans = findsubset(arr,index+1);
        int[][] ans = new int[2*smallans.length][];
        for(int i=0;i<smallans.length;i++){//copying upper array from smallans
            ans[i] = smallans[i];
        }
        for(int i= smallans.length;i<ans.length;i++){//bottom array smallans + one element
            ans[i] = new int[smallans[i- smallans.length].length+1];
        }
        for(int j= smallans.length;j< ans.length;j++){
            ans[j][0]=arr[index];
            for(int k=0;k < smallans[j- smallans.length].length;k++){
                ans[j][k+1]=smallans[j- smallans.length][k];
            }
        }
        return ans;
    }
    public static int[][] subsets(int input[]) {
        if(input.length==0){
            int[][] ans = {{}};
            return ans;
        }
        int[][] ans = findsubset(input,0);
        return ans;
    }
    private static int[][] finalans(int[][] arr,int k){
        int rows =0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum==k){
                rows++;
            }
        }
        int[][] ans = new int[rows][];
        for(int i=0,row=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum==k){
                ans[row]=arr[i];
                row++;
            }
        }
        return ans;
    }

    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        if(input.length==0){
            int[][] ans = {{}};
            return ans;
        }
        int[][] subans = subsets(input);
        int[][] ans = finalans(subans,k);
        return ans;
    }
}
