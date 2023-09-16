package Lecture4_RECURSION2.Assignment;

public class ReturnSubsetOfArray {
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
}
