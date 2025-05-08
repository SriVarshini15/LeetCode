class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=prices[0];
        if(prices.length<=1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            max=Math.max((prices[i]-min),max);
        }
        return max;
    }
}