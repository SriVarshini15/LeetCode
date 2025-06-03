class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length<2){
            return -1;
        }
        int max1=0;
        int max2=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[max1]<nums[i]){
                max2=max1;
                max1=i;
            }else if (max2 == -1 || nums[i] > nums[max2]) {
                max2 = i;
            }
        }
        return (max2 == -1 || nums[max1]>=nums[max2]*2)? max1:-1;
    }
}
