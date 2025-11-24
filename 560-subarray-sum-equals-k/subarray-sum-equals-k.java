class Solution {
    public int subarraySum(int[] nums, int k) {
        int result=0;
        int i=0;
        while(i<nums.length){
            int j=i;
            int cur=0;
            while(j<nums.length){
                cur+=nums[j];
                if(cur==k){
                    result++;
                }
                
                j++;
            }
            i++;
        }
        return result;
    }
}