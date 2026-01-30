public class Solution {
    public int MinOperations(int[] nums, int k) {
        int total=0;
        for(int i=0;i<nums.Length;i++){
            total+=nums[i];
        }
        return total%k;

        
    }
}