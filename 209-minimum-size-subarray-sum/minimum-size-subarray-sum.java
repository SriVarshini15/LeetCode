class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        /* int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int j=i;
            while(j<nums.length && sum<target){
                sum+=nums[j];
                j++;
            
            }
            
            if (sum >= target) {
                result = Math.min(result, j - i); 
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result; */
        
        int left = 0, sum = 0;
        int result = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}