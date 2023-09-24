package Lecture10_Stacks;

public class StockSpan {

    static int stock(int[] arr , int p){
        int ans = 1;
        for(int i=p-1;i>=0;i--){
            if(arr[i]<arr[p]){
                ans++;
            }else{
                return ans;
            }
        }
        return ans;
    }
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[] ans = new int[price.length];
        if(ans.length==0){
            return ans;
        }
        ans[0]=1;
        for(int i=1;i<ans.length;i++){
            if(price[i]>price[i-1]){
                ans[i]=stock(price,i);
            }else{
                ans[i]=1;
            }
        }
        return ans;
    }
}
