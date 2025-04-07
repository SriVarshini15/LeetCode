class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        x:for(int i=0;i<nums.length-1;i++){
            int val=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(val==nums[j]){
                    res[0]=i;
                    res[1]=j;
                    break x;
                }
            }
        }
        return res;
    }
}