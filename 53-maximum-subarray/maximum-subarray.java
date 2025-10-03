class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0,max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int temp=cur+nums[i];
            if(temp<nums[i]){
                cur=nums[i];
            }else{
                cur=temp;
            }
            if(cur>max){
                max=cur;
            }
        }
        return max;

    }
}