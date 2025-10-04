class Solution {
    public int findLHS(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int countI = 0, countNext = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) countI++;
                if (nums[j] == nums[i] + 1) countNext++;
            }
            if (countNext > 0) { 
                maxCount = Math.max(maxCount, countI + countNext);
            }
        }
        return maxCount;
    }
}
