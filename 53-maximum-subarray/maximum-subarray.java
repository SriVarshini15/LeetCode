class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0],max=nums[0];

        for(int i=1;i<nums.length;i++){
            cur+=nums[i];
            cur=cur>nums[i]?cur:nums[i];
            max=max<cur?cur:max;
        }
        return max;
    }
}