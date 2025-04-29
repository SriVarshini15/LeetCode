class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        if(n==1){
            return nums[0];
        }
        if(n==2){
            if(nums[0]>nums[1]){
                return nums[0];
            }
            return nums[1];
        }
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<n;i++){
            int temp=dp[i-2]+nums[i];
            if(temp<dp[i-1]){
                temp=dp[i-1];
            }
            dp[i]=temp;
        }
        return dp[n-1];
    }
}